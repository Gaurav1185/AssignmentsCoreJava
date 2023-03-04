package Practise.StringHandling.Inheritance;

public class Employee {
    String employeeName;
    int employeeId;
    int employeeSalary;
    int employeeJoiningDate;

    public Employee() {
        this.employeeJoiningDate = employeeJoiningDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public int getEmployeeJoiningDate() {
        return employeeJoiningDate;
    }

    public void setEmployeeJoiningDate(int employeeJoiningDate) {
        this.employeeJoiningDate = employeeJoiningDate;
    }

    int salary() {
        if (employeeJoiningDate >= 12102022) {
            System.out.println("His current Salary is 12000");
        }

        return 0;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Gaurav Agrawal");
        employee.setEmployeeJoiningDate(12102022);
        System.out.print(employee.getEmployeeId() + "  ");
        System.out.print(employee.getEmployeeName() + "  ");
        System.out.print(employee.getEmployeeJoiningDate() + "  ");
        System.out.print(employee.salary() + "  ");


    }


}
