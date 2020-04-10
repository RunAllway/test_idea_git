package com.example.test_idea_git.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Auther: FYC
 * @Date: 2020/4/10
 * @Descrition: com.example.test_idea_git.dto
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@ToString
public class Person {
    private String id;
    private String name;
    private Integer age;
}
