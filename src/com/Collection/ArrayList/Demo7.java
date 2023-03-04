package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {
    public static void main(String[] args) {
        List<String> courses=new ArrayList();
        courses.add("Java Developer");//add element.
        courses.add("Python Developer");
        courses.add("Front-End Developer");
        courses.add("Oracle Developer");

        System.out.println(courses);
        for (int i=0; i<courses.size();i++){//iterate through all element.
            System.out.println(courses.get(i));
        }
        String element=courses.get(0);//retrieve an element.

        System.out.println("First element in list is "+element);

        courses.remove("Front-End Developer");//remove element.

        System.out.println(courses);//print all list
    }


    }

