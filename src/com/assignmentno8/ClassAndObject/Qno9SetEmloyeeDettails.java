package com.assignmentno8.ClassAndObject;

public class Qno9SetEmloyeeDettails {
     String employeeName;
     String yearOfJoining;
     String address;
    public static void main(String[] args) {
        Qno9SetEmloyeeDettails newObj=new Qno9SetEmloyeeDettails();
        System.out.println(newObj.setEmployeeDettail("Name \t","Year Of Joining \t","Address \t"));
        System.out.println(newObj.setEmployeeDettail("Robert \t","\t1994 \t","\t64C- WallsStreat \t"));
        System.out.println(newObj.setEmployeeDettail("Sam \t","\t2000 \t","\t68C- WallsStreat \t"));
        System.out.println(newObj.setEmployeeDettail("John \t","\t1999 \t","\t26B- WallsStreat \t"));

    }

    private String setEmployeeDettail(String employeeName, String yearOFJoining, String address) {
        return employeeName+""+yearOFJoining+""+address;
    }


}
