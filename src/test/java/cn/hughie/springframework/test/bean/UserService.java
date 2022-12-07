package cn.hughie.springframework.test.bean;

/**
 * 模拟bean对象
 */
public class UserService {

    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }

    public String getAccountInfo(){
        System.out.println("获取账户详细信息");
        return "hughie:female:shenzhen";
    }

}
