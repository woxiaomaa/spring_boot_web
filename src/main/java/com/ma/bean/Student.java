package com.ma.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by mh on 2018/7/15.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    @Min(value = 18,message = "less than 18")
    private Integer age;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student(@Min(value = 18, message = "less than 18") Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }
}
