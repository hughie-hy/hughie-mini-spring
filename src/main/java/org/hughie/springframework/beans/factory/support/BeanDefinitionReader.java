package org.hughie.springframework.beans.factory.support;

import org.hughie.springframework.core.io.ClassPathResource;
import org.hughie.springframework.core.io.Resource;
import org.hughie.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource);

    void loadBeanDefinitions(Resource... resources);

    void loadBeanDefinitions(String location);

    void loadBeanDefinitions(String... location);

}
