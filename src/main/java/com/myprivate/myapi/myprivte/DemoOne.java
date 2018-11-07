package com.myprivate.myapi.myprivte;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄志强
 * @data 2018/10/24 15:14
 */
public class DemoOne {
    public void test1() {
        System.out.println(123456);
    }
    public String test2(String aaa){
        return "ff";
    }
}
