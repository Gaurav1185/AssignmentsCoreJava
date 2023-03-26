package com.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Dettails {
    public static void main(String[] args) {


//        BankEmployee bankEmployee = new BankEmployee();
        List list1 = new ArrayList<BankEmployee>();
        list1.add("Gaurav");
        list1.add("Sagar");
        list1.add("Mahesh");
        List<String> addressOfEmployee=new ArrayList();
        addressOfEmployee.add("Pune");
        addressOfEmployee.add("Hadpsar");
        addressOfEmployee.add("Katraj");
        System.out.print(list1+"\t"+addressOfEmployee);

    }


}
