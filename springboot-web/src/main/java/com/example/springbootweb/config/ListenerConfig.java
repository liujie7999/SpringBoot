package com.example.springbootweb.config;

import com.example.springbootweb.listener.SecondListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liujie
 * @Date 2020/4/22 0:23
 * @Describe
 */

@Configuration
public class ListenerConfig {

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<>(new SecondListener());

        return bean;
    }
}
