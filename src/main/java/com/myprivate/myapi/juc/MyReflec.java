package com.myprivate.myapi.juc;

import com.myprivate.myapi.domain.Person;
import com.myprivate.myapi.myprivte.DemoOne;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 黄志强
 * @data 2018/11/7 10:02
 */
public class MyReflec {
    @Test
    public void getPersion() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<DemoOne> demoOneClass = DemoOne.class;
        Class<?> person = Class.forName("com.myprivate.myapi.domain.Person");
        Method[] declaredMethods = person.getDeclaredMethods();
        for (Method method: declaredMethods) {
            System.out.println("method = " + method.toString());
        }
        //获取Person类的所有成员属性信息
        Field[] declaredFields = person.getDeclaredFields();
        for(Field f:declaredFields){
            System.out.println(f.toString());
        }
        //获取Person类的所有构造方法信息
        Constructor[] constructor=person.getDeclaredConstructors();
        for(Constructor c:constructor){
            System.out.println(c.toString());
        }
        //使用.newInstane方法创建对象
        Person o = (Person)person.newInstance();
        //获取构造方法并创建对象
        Constructor<?> property = person.getDeclaredConstructor(Long.class, String.class, Long.class);
        Person oo = (Person) property.newInstance(2L, "王五", 4L);
        System.out.println(oo);

    }
}
