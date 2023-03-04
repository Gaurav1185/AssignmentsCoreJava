package Practise.StringHandling.Inheritance;

public class EmployeeDetails extends Employee{
    String EmployeeAddress;
    char employeeGender;

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    public char getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(char employeeGender) {
        this.employeeGender = employeeGender;
    }

    public static void main(String[] args) {
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.setEmployeeGender('M');
        employeeDetails.setEmployeeAddress("Pune");
        System.out.print(employeeDetails.getEmployeeGender()+"  ");
        System.out.print(employeeDetails.getEmployeeAddress()+"  ");
    }
}
