package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {


        List employeeList = new ArrayList<>();
        Demo3 akshay = new Demo3(1, "Akshay", 22000, "Pune");
        Demo3 gaurav = new Demo3(5, "Gaurav", 25000, "Pune");
        Demo3 sagar = new Demo3(4, "Sagar", 25000, "pune");
        Demo3 yogesh = new Demo3(3, "Yogesh", 24656, "Pune");

        employeeList.add(akshay);
        employeeList.add(gaurav);
        employeeList.add(sagar);
        employeeList.add(yogesh);
        Collections.sort(employeeList);
//        for (Demo3 demo3 : employeeList) {
//            System.out.println(employeeList);
//        }





    }




}
