package com.assignmentno8.ClassAndObject;

public class Qno2Student {
    //1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
    // Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
    //2. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively
    // by creating two objects of class 'Student'.
    String name,name2;
    int rollNo,rollNo2;
    long phoneNumber,phoneNumber2;
    String address,address2;
    public static void main(String[] args) {
        Qno2Student student=new Qno2Student();
        Qno2Student newStudent=new Qno2Student();
        student.name="John";
        student.rollNo=1;
        student.phoneNumber=123456890l;
        student.address="Pune";
        System.out.println("The Name Of First Student is "+ student.name + "\nAnd his roll number is "+student.rollNo
                +"\nHe Currently live in "+student.address +"\nHis mobile number is "+student.phoneNumber);
        newStudent.name2="Sam";
        newStudent.rollNo2=2;
        newStudent.address2="pune";
        newStudent.phoneNumber2=1234567890l;
        System.out.println("The Name Of Student is "+ newStudent.name2 + "\nAnd his roll number is "+newStudent.rollNo2 +"\nHe Currently live in "
                +newStudent.address2 +"\nHis mobile number is "+newStudent.phoneNumber2);


    }
}
