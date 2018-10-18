package com.myprivate.myapi.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author 黄志强
 * @data 2018/9/1 14:47
 */
@Data
public class Person implements Serializable {


    private Long id;

    private String name;

    private Long age;

}
