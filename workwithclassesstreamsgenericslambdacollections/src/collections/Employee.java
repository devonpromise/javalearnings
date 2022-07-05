package collections;

public class Employee {

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    private String empName;
    private int empID;

    public Employee(int empID,String empName) {
        this.empName = empName;
        this.empID = empID;
    }
}
