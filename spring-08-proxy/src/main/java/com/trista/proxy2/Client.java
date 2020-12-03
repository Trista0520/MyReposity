package com.trista.proxy2;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy proxy = new UserServiceProxy(new UserServiceImpl());
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.select();
    }
}
