package com.Multithreading;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("This method is running");
            }
        };
        runnable.run();
    }
}
