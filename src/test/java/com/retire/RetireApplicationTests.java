package com.retire;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RetireApplicationTests {

    @Test
    void contextLoads() {
        Integer o1 = new Integer(11);
        Integer o2 = 11;
        System.out.println(o1==o2);

        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println(s2.equals(s3));

    }

}
