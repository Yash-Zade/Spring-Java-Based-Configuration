package org.example.config;

import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.example.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public User user(Computer com){
        User obj= new User();
        obj.setCom(com);
        return obj;
    }
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
}
