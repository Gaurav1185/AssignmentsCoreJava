package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTestList1 extends Student01 {
    public static void main(String[] args) {
        Student01 studObj=new Student01();
        List<Integer> listOfMarks=new ArrayList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks");
        for (int i = 0; i < 5; i++) {
            int m=scanner.nextInt();
            listOfMarks.add(m);

        }
        studObj.setMarks(listOfMarks);
        System.out.println("without Sorting");
        List<Integer> list1=studObj.getMarks();
        for (int n:list1
             ) {
            System.out.println(n);
        }
        System.out.println("After sorting ");
        List<Integer> list2=studObj.sortMarks();
        for (int n:listOfMarks
             ) {
            System.out.println(n);

        }
        System.out.println("After adding marks");
        List<Integer> list3=new ArrayList();
        for (int n:list3
             ) {
            System.out.println(n);

        }
        System.out.println("max marks is "+studObj.getMaxMarks());

    }

}
