package com.trista.proxy;

//客户端访问代理角色
public class Client {

    public static void main(String[] args) {
        Host host = new Host();

        //代理，中介帮房东租房子，但是中介一般有一些附属操作！
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
