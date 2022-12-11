package com.assignmentno3.operator;
//- Length and breadth of a rectangle are 5 and 7 respectively.
//- Write a program to calculate the area and perimeter of the rectangle.

public class Qno1_Print_Area_And_Perimeter {
        public static void main(String[] args) {
            int Length=5;
            int Breath=7;
            int Area;
            int Perimeter;
            Area = Length*Breath;
            System.out.println("The Area Of Rectangle is "+Area);
            Perimeter = 2*(Length+Breath);
            System.out.println("The Perimeter of Rectangle is "+Perimeter);
        }
    }


