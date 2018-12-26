package com.yml.designpatterns.proxy;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public class ProxyClient {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("Rose");
        Proxy proxy = new Proxy(mm);

        proxy.giveDolls();


    }
}
