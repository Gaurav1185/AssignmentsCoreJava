package com.Multithreading;

public class Demo3 {
    //Lambda Expression


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <=10; i++) {
                for (int j = 1; j <=100 ; j++) {
                    System.out.print(i*j+"\t");
                }
                System.out.println();
            }
            ;


        },"thread");
        t.start();
        t.join();
        for (int i =1; i <=10 ; i++) {
            for (int j = 1; j <= 20; j++) {


                System.out.print("Hello" + "\t");

            }
            System.out.println();
        }
    }
}
