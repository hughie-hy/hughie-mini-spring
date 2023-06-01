package org.hughie.springframework.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author hughie.cheng
 * @since 2023/6/1
 */
public class AdvisedSupport {

    // 被代理的目标对象
    private TargetSource targetSource;

    // 方法拦截器
    private MethodInterceptor methodInterceptor;

    // 方法匹配器(检查目标方法是否符合通知条件)
    private MethodMatcher methodMatcher;
}
