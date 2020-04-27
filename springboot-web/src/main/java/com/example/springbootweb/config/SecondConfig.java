package com.example.springbootweb.config;

import com.example.springbootweb.filter.SecondFilter;
import com.example.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liujie
 * @Date 2020/4/22 0:14
 * @Describe
 */

@Configuration
public class SecondConfig {

    /**
     *      完成Filter组件的注册二
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<SecondFilter> bean = new FilterRegistrationBean<>(new SecondFilter());
        bean.addUrlPatterns("/second");
        return bean;
    }
}
