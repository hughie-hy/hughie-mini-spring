package org.hughie.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class AssetDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("招商银行", "20000");
        hashMap.put("中国银行", "80000");
        hashMap.put("平安银行", "90000");
    }

    public String queryAsset(String bankName) {
        System.out.println(bankName + "：" + hashMap.get(bankName));
        return hashMap.get(bankName);
    }
}
