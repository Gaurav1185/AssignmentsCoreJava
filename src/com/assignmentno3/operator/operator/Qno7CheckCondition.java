package com.assignmentno3.operator.operator;
//Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions
// 'a < 50' and 'a < b' are true.
public class Qno7CheckCondition {
    public static void main(String[] args) {
        int a=55;
        int b=70;
        if(a<50){
            System.out.println("A is less than 50 "+a);
        }
        else if(a<b){
            System.out.println("A is less than B");
        }
    }
}
