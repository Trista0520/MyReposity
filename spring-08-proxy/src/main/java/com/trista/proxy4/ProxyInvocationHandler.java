package com.trista.proxy4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //要代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //获得代理
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    //增加日志功能
    public void log(String str){
        System.out.println("正在执行" + str + "功能");
    }
}
