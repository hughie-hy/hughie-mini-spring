package org.hughie.springframework.context;

import org.hughie.springframework.beans.BeansException;

/**
 * SPI 接口配置应用上下文 SPI interface to be implemented by most if not all application contexts.
 * Provides facilities to configure an application context in addition
 * to the application context client methods in the
 * {@link org.hughie.springframework.context.ApplicationContext} interface.
 *
 * @author hughie.cheng
 * @since 2023/5/24
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
