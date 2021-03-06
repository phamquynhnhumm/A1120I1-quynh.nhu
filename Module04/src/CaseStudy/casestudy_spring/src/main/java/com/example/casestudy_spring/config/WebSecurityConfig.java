package com.example.casestudy_spring.config;

import com.example.casestudy_spring.sercurity.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;



    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests().antMatchers("/khachhang/**").access("hasAnyRole('ROLE_ADMIN','ROLE_KHACHHANG')");
        http.authorizeRequests().antMatchers("/nhanvien/**").access("hasAnyRole('ROLE_ADMIN','ROLE_NHANVIEN')");
        http.authorizeRequests().antMatchers("/dichvu/**").access("hasAnyRole('ROLE_ADMIN','ROLE_DICHVU')");
        http.authorizeRequests().antMatchers("/hopdong/**").access("hasAnyRole('ROLE_ADMIN','ROLE_HOPDONG')");

        // n???u kh??ng c?? quy???n tr??? v???  /403
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

        // C??c trang kh??ng y??u c???u login
        http.authorizeRequests().antMatchers( "/","/login","/logout").permitAll();


        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

        // C???u h??nh cho Login Form.
        http.authorizeRequests().and().formLogin()//
                // Submit URL c???a trang login
                .loginProcessingUrl("/j_spring_security_check") // Submit URL
                .loginPage("/login")//
                .usernameParameter("username")//
                .passwordParameter("password")
                .defaultSuccessUrl("/")
                .failureUrl("/login?error=true");//

        // C???u h??nh cho Logout Page.
//                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/");

        // C???u h??nh Remember Me.
        http.authorizeRequests().and() //
                .rememberMe().tokenRepository(this.persistentTokenRepository()) //
                .tokenValiditySeconds(60 * 60 * 60); // 24h
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        InMemoryTokenRepositoryImpl memory = new InMemoryTokenRepositoryImpl();
        return memory;
    }

}