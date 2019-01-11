package com.yml.designpatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Liuym
 * @date 2019/1/2 0002
 */
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.execute(()->thread.start());

    }
}
class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("run...");
    }
}