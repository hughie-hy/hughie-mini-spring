package org.hughie.springframework.context.support;

import org.hughie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.hughie.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * 抽象基类 XML 上下文 Convenient base class for {@link org.hughie.springframework.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link org.hughie.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 *
 * @author hughie.cheng
 * @since 2023/5/26
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configurations = getConfigurations();
        if (null != configurations) {
            beanDefinitionReader.loadBeanDefinitions(configurations);
        }
    }

    protected abstract String[] getConfigurations();
}
