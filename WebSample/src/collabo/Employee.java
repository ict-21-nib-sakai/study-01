package collabo;

public class Employee {
    private String emp_id;
    private String emp_name;

    public String getEmp_id() {
        return emp_id;
    }

    public Employee setEmp_id(String emp_id) {
        this.emp_id = emp_id;
        return this;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public Employee setEmp_name(String emp_name) {
        this.emp_name = emp_name;
        return this;
    }
}
