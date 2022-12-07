package cn.hughie.springframework.test;

import org.junit.Test;

import java.util.HashMap;


public class myTest {
    @Test
    public void TestR(){
        HashMap<String,String> map = new HashMap();
        map.put("1","2");
        String put = map.put("1", "1");
        System.out.println(put);
    }
}
