package com.example.casestudy_spring.model.entity.taikhoan;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "vaiTro")
public class VaiTro {
    @Id
    @Column(name = "vaitro")
    private String vaitro;

    @Column(name = "ten_vaitro")
    private String tenVaitro;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "userVatro",
//            joinColumns =  @JoinColumn(name = "vaitroId",referencedColumnName = "vaitro"),
//            inverseJoinColumns = @JoinColumn(name = "tenUserId",referencedColumnName = "tenuser"))



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_vaitro", joinColumns = @JoinColumn(name = "vaitro_id", referencedColumnName = "vaitro"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "tenuser"))
    private Set<User> userSet;
    //Để biểu thị mối quan hệ nhiều nhiều ta dùng annotation @ManyToMany
//Annotation @JoinTable sẽ chỉ rõ bảng trung gian trong thuộc tính name,
// thuộc tính joinColumns sẽ chỉ rõ column mapping với tale hiện tại,
// thuộc tính inverseJoinColumns sẽ chỉ rõ column mapping với table còn lại
    public VaiTro() {

    }

    public VaiTro(String vaitro, String tenVaitro, Set<User> userSet) {
        this.vaitro = vaitro;
        this.tenVaitro = tenVaitro;
        this.userSet = userSet;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public String getTenVaitro() {
        return tenVaitro;
    }

    public void setTenVaitro(String tenVaitro) {
        this.tenVaitro = tenVaitro;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
