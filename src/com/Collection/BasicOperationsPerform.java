package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class BasicOperationsPerform   {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
       /* for (int i = 0; i <=list.size() ; i++) {
            System.out.println(list);

        }
        list.remove(0);
        System.out.println(list);


*/
    List list1=new ArrayList();
    list1.add(501);
        list1.add(501);
        list1.add(501);
        list1.addAll(list);
        System.out.println(list1);
        list.remove(0);//101
        System.out.println(list);
        list1.removeAll(list);
        System.out.println(list);


    }


}
