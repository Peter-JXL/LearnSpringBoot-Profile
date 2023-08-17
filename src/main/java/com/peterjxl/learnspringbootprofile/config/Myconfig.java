package com.peterjxl.learnspringbootprofile.config;


import com.peterjxl.learnspringbootprofile.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Myconfig {

    @Bean
    @Profile("prod")
    public Color red() {
        return new Color("red");
    }

    @Bean
    @Profile("test")
    public Color blue() {
        return new Color("blue");
    }
}
