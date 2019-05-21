package com.codecool.teatr.model.todelete;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String fName;
    private String lName;
    private String password;
    private boolean tokenExpired;

//    @Autowired
//    @Transient
//    private EncryptedPasswordUtil encryptedPasswordUtil;

    public User() {
//        encryptedPasswordUtil = new EncryptedPasswordUtil();
    }

    /*@ManyToMany
        private List<RoleToPlay> roles;
    */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        this.password = encryptedPasswordUtil.encryptPassword(password);
////        this.password = password;
//    }

    public boolean isTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
    }

    @Override
    public String toString() {
        return "User{" +
//                "encryptedPasswordUtil=" + encryptedPasswordUtil +
                ", id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", password='" + password + '\'' +
                ", tokenExpired=" + tokenExpired +
                '}';
    }
}
