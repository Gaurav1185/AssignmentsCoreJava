package com.Multithreading;
//Traditional Way
public class Demo1  {


    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            for (int i = 1; i <=10 ; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();

            }

        },"NewThread");
        t.start();
        t.join();
        for (int i = 11; i <=20 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }

}
