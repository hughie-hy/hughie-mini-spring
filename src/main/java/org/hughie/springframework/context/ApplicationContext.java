package org.hughie.springframework.context;

import org.hughie.springframework.beans.factory.ListableBeanFactory;

/**
 * Central interface to prov
 * This is read-only while the application is run
 * reloaded if the implementation supports this.
 *
 * @author hughie.cheng
 * @since 2023/5/24
 */
public interface ApplicationContext extends ListableBeanFactory {
}
