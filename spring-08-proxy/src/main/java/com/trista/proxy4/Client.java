package com.trista.proxy4;

import com.trista.proxy2.UserService;
import com.trista.proxy2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.select();
        proxy.delete();
    }
}
