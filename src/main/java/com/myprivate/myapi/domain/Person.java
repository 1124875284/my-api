package com.myprivate.myapi.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author 黄志强
 * @data 2018/9/1 14:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {


    private static final long serialVersionUID = -3491286488716601916L;
    private Long id;

    private String name;

    private Long age;


}
