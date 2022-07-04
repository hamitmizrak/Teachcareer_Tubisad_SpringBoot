package com.hamitmizrak.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityData  extends WebSecurityConfigurerAdapter {

 @Override
  protected void configure(HttpSecurity http) throws Exception {
   http
           .authorizeRequests()
           .antMatchers("/","/security/public","/login","/index").permitAll()
           .anyRequest().authenticated()
           .and().formLogin().loginPage("/login");
  }

  @Autowired
    public void myDataUser(AuthenticationManagerBuilder authentication) throws Exception {
    PasswordEncoder encoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
      authentication
              .inMemoryAuthentication()
              .withUser("root")
              //.password("{noop}root")
              .password(encoder.encode("root"))
              .roles("USER");
    }

}
