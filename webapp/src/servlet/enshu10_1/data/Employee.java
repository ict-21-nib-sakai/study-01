package servlet.enshu10_1.data;

import java.sql.Timestamp;

public class Employee {
    /** 従業員ID */
    private int empId;

    /** 従業員名 */
    private String name;

    /** 部署ID */
    private int deptId;

    /** 登録日時 */
    private Timestamp registeredDate;

    /** 部署 */
    private Department department;

    public int getEmpId() {
        return empId;
    }

    public Employee setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getDeptId() {
        return deptId;
    }

    public Employee setDeptId(int deptId) {
        this.deptId = deptId;
        return this;
    }

    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    public Employee setRegisteredDate(Timestamp registeredDate) {
        this.registeredDate = registeredDate;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Employee setDepartment(Department department) {
        this.department = department;
        return this;
    }
}
