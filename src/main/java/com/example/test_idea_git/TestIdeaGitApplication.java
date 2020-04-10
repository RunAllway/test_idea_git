package com.example.test_idea_git;

import com.example.test_idea_git.dto.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestIdeaGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestIdeaGitApplication.class, args);
        Person p = new Person("zahngsan","lsi",12);
        System.out.println(p);
        System.out.println(p);
    }

}
