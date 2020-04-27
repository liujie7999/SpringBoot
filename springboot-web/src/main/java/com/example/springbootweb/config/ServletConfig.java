package com.example.springbootweb.config;

import com.example.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @Author liujie
 * @Date 2020/4/21 23:51
 * @Describe
 */

@Configuration
public class ServletConfig {

    /**
     *      完成servlet组件的注册二
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());

        servletRegistrationBean.addUrlMappings("/second");
        return servletRegistrationBean;
    }
}
