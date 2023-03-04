package com.Collection.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class InsertElement implements Comparable {
    public static void main(String[] args) {
        List studentName=new ArrayList();
        studentName.add("Akshay");
        studentName.add("Gaurav");
        studentName.add("Vinod");
        studentName.add("Sagar");
        studentName.add("Dhananjay");

        System.out.println(studentName);




    }

    public void compareTo(InsertElement insertElement) {
        return ;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
