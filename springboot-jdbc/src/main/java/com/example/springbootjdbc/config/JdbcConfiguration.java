package com.example.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 *      数据源的JDBC配置类
 */
// @Configuration
// //@PropertySource("classpath:/jdbc.properties")  //加载指定的Properties配置文件
// @EnableConfigurationProperties(JdbcProperties.class)    //指定加载哪个类的配置属性
public class JdbcConfiguration {

    // @Autowired
    // private JdbcProperties jdbcProperties;
    //
    // public JdbcConfiguration(JdbcProperties jdbcConfiguraties){
    //     this.jdbcProperties  = jdbcConfiguraties;
    // }
    // //实例化bean
    // @Bean
    // public DataSource getDataSource(JdbcProperties jdbcProperties){
    //     DruidDataSource source = new DruidDataSource();
    //     source.setUsername(jdbcProperties.getUsername());
    //     source.setPassword(jdbcProperties.getPassword());
    //     source.setUrl(jdbcProperties.getUrl());
    //     source.setDriverClassName(jdbcProperties.getDriverClassName());
    //     return source;
    // }
}
