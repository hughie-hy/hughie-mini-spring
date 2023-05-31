package org.hughie.springframework.test.tenthcharpter;

/**
 * @author hughie.cheng
 * @since 2023/5/31
 */
public class SuperClass {
    private Integer primary;

    private String Template;

    // 若父类仅存在有参构造方法那么其子类也必须要有参构造方法
    public SuperClass() {
    }

    public SuperClass(Integer primary, String template) {
        this.primary = primary;
        Template = template;
    }
}
