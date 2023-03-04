package Practise.StringHandling.OOPS;

public class Enc {
    private int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public static void main(String[] args) {
        Enc encapsulation=new Enc();
        encapsulation.setEmployeeId(12345678);
        System.out.println(encapsulation.getEmployeeId());

    }
}
