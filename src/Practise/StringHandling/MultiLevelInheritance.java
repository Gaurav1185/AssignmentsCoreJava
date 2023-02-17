package Practise.StringHandling;

public class MultiLevelInheritance {
    int variableA=1;
    int variableB=2;
    int Addition(int A,int B){
        return A+B;
    }
}
class Second extends MultiLevelInheritance{
    int variableC=3;
    int variableD=4;

}
class Third extends Second{
    int variableE=5;
    int variableF=6;

    public static void main(String[] args) {
        MultiLevelInheritance first=new MultiLevelInheritance();
        Second second=new Second();
        Third third=new Third();
        System.out.println(first.Addition(first.variableA, first.variableB));
        System.out.println(second.Addition(second.variableB, second.variableC));
        System.out.println(third.Addition(first.variableA, second.variableC));
    }
}
