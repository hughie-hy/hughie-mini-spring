package org.hughie.springframework.test;

import org.hughie.springframework.beans.PropertyValue;
import org.hughie.springframework.beans.PropertyValues;
import org.hughie.springframework.beans.factory.config.BeanDefinition;
import org.hughie.springframework.beans.factory.config.BeanReference;
import org.hughie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.hughie.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.hughie.springframework.test.bean.AssetDao;
import org.hughie.springframework.test.bean.AssetService;
import org.hughie.springframework.test.bean.UserDao;
import org.hughie.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 获取bean测试
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
//        // 1.初始化 BeanFactory
//        BeanFactory beanFactory = new BeanFactory();
//
//        // 2.注入bean
//        beanFactory.registerBeanDefinition("userService",new BeanDefinition(new UserService()));
//
//        // 3.获取并使用bean
//        UserService userService = (UserService)beanFactory.getBean("userService");
//        userService.getAccountInfo();
    }

    @Test
    public void testBeans() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.定义、注入bean
        BeanDefinition definition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", definition);

        // 3.获取并使用bean
        UserService userService = (UserService) beanFactory.getBean("userService", "hughie");
        userService.getAccountInfo();
    }

    @Test
    public void testBeanAsset() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.定义、注入bean
        BeanDefinition definition = new BeanDefinition(AssetService.class);
        beanFactory.registerBeanDefinition("assetService", definition);

        // 3.获取并使用bean
        AssetService assertService = (AssetService) beanFactory.getBean("assetService");
        assertService.queryAssert();
    }

    @Test
    public void testProperty() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // assetDao注入容器
        BeanDefinition assetDaoDefinition = new BeanDefinition(AssetDao.class);
        beanFactory.registerBeanDefinition("assetDao", assetDaoDefinition);

        // bean注入属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("assetDao", new BeanReference("assetDao")));

        beanFactory.registerBeanDefinition("assetService", new BeanDefinition(AssetService.class, propertyValues));

        AssetService assetService = (AssetService) beanFactory.getBean("assetService");

        assetService.queryAssert("招商银行");


    }

    @Test
    public void testV(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 通过配置文件注入对象
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        AssetService assetService = (AssetService)beanFactory.getBean("assetService");
        assetService.queryAssert("招商银行");
    }

}
