package com.trista.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//相当于 <bean id = "user" class = "com.trista.pojo.User"/>
@Component
@Scope("Prototype")
public class User {

    //相当于<property name = "name" value = "丽丽"/>
    @Value("丽丽")
    private String name;

    public String getName() {
        return name;
    }
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
