package com.example.test_idea_git.dto;

/**
 * @Auther: FYC
 * @Date: 2020/4/10
 * @Descrition: com.example.test_idea_git.dto
 * @version: 1.0
 */
public class Employee {
    private String id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
