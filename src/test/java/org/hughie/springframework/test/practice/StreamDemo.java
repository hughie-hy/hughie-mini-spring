package org.hughie.springframework.test.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author hughie.cheng
 * @since 2023/5/26
 */
public class StreamDemo {

    static HashMap<String, String> map = new HashMap<>();


    static {
        map.put("tom", "csu");
        map.put("john", "pku");
        map.put("frank", "tsu");
    }


    public void getUn(String name){
        System.out.println(map.get(name));
        map.get(name);
    }

    @Test
    public void streamT(){
        ArrayList<String> list = new ArrayList<>();
        list.add("frank");
        list.add("tom");

        list.forEach(this::getUn);
    }

}
