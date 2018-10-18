package com.myprivate.myapi.test;


import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 黄志强
 * @data 2018/9/1 14:57
 */
//@Component
public class PersonServiceImpl {



    public static void main(String[] args) {

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

}
