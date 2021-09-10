package servlet.enshu09_3;

/**
 * 演習 9.3 EL式とJSTLの利用 (c:forEach タグ)
 */
public class Employee {
    /** 従業員ID */
    private int empId;

    /** 従業員名 */
    private String empName;

    /** 部署名 */
    private String deptName;

    Employee(int empId, String empName, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptName = deptName;
    }

    public int getEmpId() {
        return empId;
    }

    public Employee setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public String getEmpName() {
        return empName;
    }

    public Employee setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public String getDeptName() {
        return deptName;
    }

    public Employee setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
}
