package com.example.phone.model.entity;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name = "phone")
public class Phone  implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotEmpty(message = "Không được để trống")
    @Size(min = 10, max = 12, message = "phải có độ dài 10-11 số")
    @Column(name = "number")
    private String number;

    public Phone() {
    }

    public Phone(Integer id, @NotEmpty(message = "Không được để trống") String number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Phone phone = (Phone) target;
//        String number = phoneNumber.getNumber();
//        ValidationUtils.rejectIfEmpty(errors, "number", "number.empty");
//        if (phoneNumber.length()>11 || number.length()<10){
//            errors.rejectValue("number", "number.length");
//        }
        if (!phone.number.startsWith("0")){
            errors.rejectValue("number", "number.startsWith");
        }
//        if (!number.matches("(^$|[0-9]*$)")){
//            errors.rejectValue("number", "number.matches");
//        }

    }
}

