package com.trista.config;

import com.trista.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这各也会被Spring容器托管，因为它本来也是一个Component
//Configuration代表这是一个配置类，和之前的beans.xml是一样的
@Configuration
@ComponentScan("com.trista.pojo")
@Import(appConfig2.class)
public class appConfig {
    //注册一个bean，就相当于之前写的bean标签
    //这个方法的名字，相当于bean中的id属性
    //这个方法的返回值，相当于bean中的class属性
    @Bean
    public User getUser() {
        return new User();  //就是返回要注入到bean中的对象
    }
}
