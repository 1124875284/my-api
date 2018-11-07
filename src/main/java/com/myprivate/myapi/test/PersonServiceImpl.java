package com.myprivate.myapi.test;


import io.netty.util.concurrent.Future;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author 黄志强
 * @data 2018/9/1 14:57
 */
//@Component
public class PersonServiceImpl {



    public static void demo1(String[] args) {

        String[] str={"a123","b123","c123","d123","e123"};
        List<String> list=Arrays.asList(str);

        List list1=new ArrayList();

        list.forEach(System.out::println);

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(123);
            }
        };

        Runnable race2=()-> System.out.println("runnable = " + runnable);
    }
    @Test
    public void demo2(){
        Map<String,String> map=new HashMap<>(1);
        map.put(null,"123");
        System.out.println("map = " + map.size());
        map.put(null,null);
        System.out.println("map = " + map);


        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put("123","546");

        HashSet set=new HashSet();

    }
    public void demo3(){
        Map<String,String> map=new HashMap<>(1);
        map.put(null,"123");
        Map<String, String> map1 = Collections.synchronizedMap(new HashMap<>(2));

        List<Future> list=new ArrayList<>();
    }

}
