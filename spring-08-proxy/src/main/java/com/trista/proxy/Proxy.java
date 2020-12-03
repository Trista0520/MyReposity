package com.trista.proxy;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    //看房子
    public void seeHouse(){
        System.out.println("看房子");
    }

    //中介帮房东租房
    public void rent() {
        seeHouse();
        host.rent();
        sign();
    }

    //签合同
    public void sign(){
        System.out.println("签合同");
    }
}
