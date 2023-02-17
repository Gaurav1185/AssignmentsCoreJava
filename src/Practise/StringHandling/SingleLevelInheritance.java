package Practise.StringHandling;

public class SingleLevelInheritance {
    int variableA=343;
    int variableB=355;
    int  addition(int variableA, int variableB){
        System.out.println("Addition Of Two Variable is"+ (variableA+variableB));
       return 0;
    }
}
class Another  extends SingleLevelInheritance{
    int variableC=455;
    int variableD=564;

    public static void main(String[] args) {
        SingleLevelInheritance single=new SingleLevelInheritance();
        Another another=new Another();
        System.out.println(single.addition(another.variableA, another.variableB)+" ");
        System.out.println(single.addition(another.variableD,another.variableD)+" ");

    }
}
