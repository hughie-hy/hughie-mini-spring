package org.hughie.springframework.beans.factory.xml;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.XmlUtil;
import org.hughie.springframework.beans.BeansException;
import org.hughie.springframework.beans.PropertyValue;
import org.hughie.springframework.beans.factory.config.BeanDefinition;
import org.hughie.springframework.beans.factory.config.BeanReference;
import org.hughie.springframework.beans.factory.support.AbstractBeanDefinitionReader;
import org.hughie.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.hughie.springframework.core.io.Resource;
import org.hughie.springframework.core.io.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.InputStream;

public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    public XmlBeanDefinitionReader(BeanDefinitionRegistry registry) {
        super(registry);
    }

    public XmlBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        super(registry, resourceLoader);
    }

    @Override
    public void loadBeanDefinitions(Resource resource) {
        try {
            InputStream inputStream = resource.getInputStream();
            doLoadBeanDefinitions(inputStream);
        } catch (IOException | ClassNotFoundException e) {
            throw new BeansException("", e);
        }
    }

    @Override
    public void loadBeanDefinitions(Resource... resources) {
        for (Resource resource : resources) {
            this.loadBeanDefinitions(resource);
        }
    }

    @Override
    public void loadBeanDefinitions(String location) {
        ResourceLoader resourceLoader = getResourceLoader();
        Resource resource = resourceLoader.getResource(location);
        this.loadBeanDefinitions(resource);
    }

    @Override
    public void loadBeanDefinitions(String... locations) {
        for (String location : locations) {
            this.loadBeanDefinitions(location);
        }
    }

    public void doLoadBeanDefinitions(InputStream inputStream) throws ClassNotFoundException {
        Document xmlDoc = XmlUtil.readXML(inputStream);
        Element root = xmlDoc.getDocumentElement();
        NodeList childNodes = root.getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {
            if (!(childNodes.item(i) instanceof Element)) continue;
            // 判断是否为bean
            if (!"bean".equals(childNodes.item(i).getNodeName())) continue;
            // 解析标签
            Element bean = (Element) childNodes.item(i);
            String id = bean.getAttribute("id");
            String name = bean.getAttribute("name");
            String className = bean.getAttribute("class");
            String initMethod = bean.getAttribute("init-method");
            String destroyMethod = bean.getAttribute("destroy-method");
            String beanScope = bean.getAttribute("scope");
            // 获取 Class，方便获取类中的名称
            Class<?> clazz = Class.forName(className);
            // 优先级 id > name
            String beanName = StrUtil.isNotEmpty(id) ? id : name;
            if (StrUtil.isEmpty(beanName)) {
                beanName = StrUtil.lowerFirst(clazz.getSimpleName());
            }

            // 定义Bean
            BeanDefinition beanDefinition = new BeanDefinition(clazz);
            beanDefinition.setInitMethodName(initMethod);
            beanDefinition.setDestroyMethodName(destroyMethod);
            if (StrUtil.isNotEmpty(beanScope)) {
                beanDefinition.setScope(beanScope);
            }
            // 读取属性并填充
            for (int j = 0; j < bean.getChildNodes().getLength(); j++) {
                if (!(bean.getChildNodes().item(j) instanceof Element)) continue;
                if (!"property".equals(bean.getChildNodes().item(j).getNodeName())) continue;
                // 解析标签：property
                Element property = (Element) bean.getChildNodes().item(j);
                String attrName = property.getAttribute("name");
                String attrValue = property.getAttribute("value");
                String attrRef = property.getAttribute("ref");
                // 获取属性值：引入对象、值对象
                Object value = StrUtil.isNotEmpty(attrRef) ? new BeanReference(attrRef) : attrValue;
                // 创建属性信息
                PropertyValue propertyValue = new PropertyValue(attrName, value);
                beanDefinition.getPropertyValues().addPropertyValue(propertyValue);
            }
            if (getRegistry().containsBeanDefinition(beanName)) {
                throw new BeansException("Duplicate beanName[" + beanName + "] is not allowed");
            }
            // 注册 BeanDefinition
            getRegistry().registerBeanDefinition(beanName, beanDefinition);
        }
    }
}
