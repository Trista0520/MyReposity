package com.trista.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//这个注解的意思是，这个类被Spring托管了注册到了容器中
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("丽丽")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
