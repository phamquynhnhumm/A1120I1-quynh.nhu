package com.example.validate_form.model.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "user")
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 5, max = 45,message = " Độ dài tối thiểu 5 tối đa 45")
    @Column(name = "ten")
    private String ten;

    @Size(min = 5, max = 45,message = " Độ dài tối thiểu 5 tối đa 45")

    @NotEmpty(message = "Không được để trống")
    @Column(name = "ho")
    private String ho;


    @NotEmpty(message = "Không được để trống")
    @Size(min = 10, max = 12, message = "phải có độ dài 10-11 số")
    @Column(name = "sdt")
    private String sdt;

//    @NotBlank(message = "Không được để trống")
    @Min(value = 18, message = "Tuổi phai lớn hơn 18")
    @Column(name = "tuoi")
    private Integer tuoi;

    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$", message = "Phải nhập đúng định dạng email")
    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(Integer id, String ten, String ho, String sdt, Integer tuoi, String email) {
        this.id = id;
        this.ten = ten;
        this.ho = ho;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user= (User) target;
        if (!user.sdt.startsWith("0")){
            errors.rejectValue("sdt", "number.startsWith");
        }
    }
}
