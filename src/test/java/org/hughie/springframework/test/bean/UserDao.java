package org.hughie.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("001", "tom");
        hashMap.put("002", "jenny");
        hashMap.put("003", "hughie");
    }

    public void initMethod() {
        System.out.println("executing: initMethod");
        hashMap.put("001", "tom");
        hashMap.put("002", "jenny");
        hashMap.put("003", "hughie");
    }

    public void destroyDataMethod() {
        System.out.println("executing：destroy-method");
        hashMap.clear();
    }


    public String queryUserName(String uId) {
        System.out.println(hashMap.get(uId));
        return hashMap.get(uId);
    }

}