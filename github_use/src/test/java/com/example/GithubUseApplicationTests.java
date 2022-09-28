package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class GithubUseApplicationTests {

    /**
     * test 双列队列 --》 Map
     */
    @Test
    void contextLoads() {
        Map<String, String> map = new HashMap<>();
        map.put("001", "master");
        map.put("002", "faker");
        System.out.println("---- keySet + 增强 for ----");
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println("---- entry + 增强 for ----");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key + " " + value);
        }
        System.out.println("---- foreach + lambda ----");

//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String key, String value) {
//                System.out.println(key + " " + value);
//            }
//        });
        map.forEach((key, value) -> System.out.println(key + " " + value));


        System.out.println("--------");
        System.out.println("--------");
    }

}
