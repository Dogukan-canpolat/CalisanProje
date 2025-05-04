/*

package com.kanka.calisanProje.controller;


import com.kanka.calisanProje.model.UygulamaKullanicisi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private jwtUtil JwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody UygulamaKullanicisi kullanici) {
        if (kullanici.getEmail().equals("admin@gmail.com") && kullanici.getSifre().equals("1234")) {
            return JwtUtil.generateToken(kullanici.getEmail());
        } else {
            return "Geçersiz kullanıcı bilgisi!";
        }
    }
}
*/