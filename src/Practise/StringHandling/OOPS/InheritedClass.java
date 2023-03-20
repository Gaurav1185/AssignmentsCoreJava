package Practise.StringHandling.OOPS;

public class InheritedClass extends InheritanceNEW {
    private int variableC;

    public int getVariableC() {
        return variableC;
    }

    public void setVariableC(int variableC) {
        this.variableC = variableC;
    }

    public int getVariableD() {
        return variableD;
    }

    public void setVariableD(int variableD) {
        this.variableD = variableD;
    }

    private int variableD;

    public static void main(String[] args) {
        InheritanceNEW inheritance=new InheritedClass();
        InheritedClass inheritedClass=new InheritedClass();
        inheritedClass.setVariableC(255);
        inheritedClass.setVariableD(654);
        System.out.println(inheritance.variableA+inheritedClass.variableC);
        System.out.println(inheritance.variableB+inheritedClass.variableD);
    }

}
