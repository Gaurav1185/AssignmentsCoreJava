package Practise.StringHandling.OOPS;

public class EncapsulatedClass {
    public static void main(String[] args) {
        Encapsulation sc=new Encapsulation();
        sc.setRollNo(1);
        sc.setStudentName("Gaurav Agrawal");
        sc.setStudentClass("MCA Post Graduated");
        sc.setStudentDateOfBirth("01-12-1998");
        System.out.print(sc.getStudentName()+" ");
        System.out.print(sc.getRollNo()+" ");
        System.out.print(sc.getStudentDateOfBirth()+" ");
        System.out.print(sc.getStudentClass()+" ");
    }
}
