//package com.codecool.teatr.util;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class EncryptedPasswordUtil {
//    public String encryptPassword(String password) {
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        return encoder.encode(password);
//    }
//
//    public boolean isPasswordCorrect(String rawPassword, String encodedPassword) {
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        return encoder.matches(rawPassword,encodedPassword);
//    }
//}
