package org.hughie.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("101", "hughie1");
        hashMap.put("102", "hughie2");
        hashMap.put("103", "hughie3");
    }

    public String queryUserName(String uId) {
        System.out.println(hashMap.get(uId));
        return hashMap.get(uId);
    }

}