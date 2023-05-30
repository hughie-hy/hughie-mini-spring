package org.hughie.springframework.test.ninethchapter;


import org.hughie.springframework.beans.factory.FactoryBean;

public class ProxyBeanFactory implements FactoryBean<IUserDao> {

    @Override
    public IUserDao getObject() throws Exception {
        IUserDao iUserDao = new IUserDao() {
            @Override
            public String queryUserName(String uId) {
                String x = "我是代理后的iUserDao对象哦！";
                return x;
            }
        };

        return iUserDao;
    }

    @Override
    public Class<?> getObjectType() {
        return IUserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
