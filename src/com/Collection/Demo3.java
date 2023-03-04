package com.Collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 implements Comparator<Demo3> {

int employeeId;
String employeeName;
int employeeSalary;
String employeeAddress;


    public Demo3(int employeeId, String employeeName, int employeeSalary, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAddress = employeeAddress;
    }


    @Override
    public int compare(Demo3 o1, Demo3 o2) {
        return 0;
    }
}
