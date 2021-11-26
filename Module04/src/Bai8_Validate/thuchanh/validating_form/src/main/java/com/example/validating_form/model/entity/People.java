package com.example.validating_form.model.entity;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 2, max = 30 , message = "Tên phải ít nhất 2 chữ và nhiều nhất 30 chữ")
    @Column(name = "name")
    private String name;


    @Min(value = 18, message = "tuổi phải lớn hơn hoặc bằng 18")
    @Column(name = "age")
    private  Integer age;

    public People() {
    }

    public People(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
