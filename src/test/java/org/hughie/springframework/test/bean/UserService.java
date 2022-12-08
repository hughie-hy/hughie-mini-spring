package org.hughie.springframework.test.bean;

/**
 * 模拟bean对象
 */
public class UserService {

    private String userName;

    public UserService(String userName) {
        this.userName = userName;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息");
    }

    public void getAccountInfo() {
        System.out.println("获取账户详细信息：" + userName);
    }

    public void getUsername() {
        System.out.println(userName);
    }

}
