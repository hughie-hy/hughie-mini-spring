package org.hughie.springframework.aop.framework;

import org.hughie.springframework.aop.AdvisedSupport;

/**
 * @author hughie.cheng
 * @since 2023/6/1
 */
public class Cglib2AopProxy implements AopProxy{

    private final AdvisedSupport advised;

    public Cglib2AopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }

    @Override
    public Object getProxy() {
        return null;
    }
}
