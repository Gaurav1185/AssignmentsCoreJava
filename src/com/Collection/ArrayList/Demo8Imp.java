package com.Collection.ArrayList;

public class Demo8Imp implements Comparable{
    int employeeId;
    String employeeName;
    String employeeAddress;

    public Demo8Imp(int employeeId, String employeeName, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Demo5Imp{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return  this.employeeId-this.employeeId;}
    }

