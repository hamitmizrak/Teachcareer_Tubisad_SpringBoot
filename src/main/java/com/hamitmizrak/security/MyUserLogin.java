package com.hamitmizrak.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyUserLogin {

    // http://localhost:8080/login
    // http://localhost:8080/login?error
    @GetMapping("/login")
    public String getLogin(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("login_key", "Kullanıcı adı veya şifreniz yanlış");
        } else {
            model.addAttribute("login_key", "Lütfen Bilgileri Giriniz");
        }
        return "login";
    }

    // http://localhost:8080/logout
    @GetMapping("/logout")
    public String getLogout(HttpServletRequest request, HttpServletResponse response,Model model){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();

        if(authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
            model.addAttribute("logout_key","Çıkış yapıldı");
        }else
            model.addAttribute("logout_key","Çıkış Başarısız");

        return "logout";
    }
}
