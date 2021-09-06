package enshu06_2;

import java.sql.Timestamp;

public class Employee {
    /** 従業員ID */
    private int emp_id;

    /** 氏名 */
    private String emp_name;

    /** 部署ID */
    private int dept_id;

    /** 登録日時 */
    private Timestamp registered_date;

    /** 従業員が所属する部署のクラス */
    private Department department;

    public int getEmp_id() {
        return emp_id;
    }

    public Employee setEmp_id(int emp_id) {
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

    public int getDept_id() {
        return dept_id;
    }

    public Employee setDept_id(int dept_id) {
        this.dept_id = dept_id;
        return this;
    }

    public Timestamp getRegistered_date() {
        return registered_date;
    }

    public Employee setRegistered_date(Timestamp registered_date) {
        this.registered_date = registered_date;
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
