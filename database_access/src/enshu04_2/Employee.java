package enshu04_2;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Employee {
    /** 従業員ID */
    private int emp_id;

    /** 従業員の氏名 */
    private String emp_name;

    /** 部署ID */
    private int dept_id;

    /** 登録日時 */
    private Timestamp registered_date;

    public Employee(int emp_id, String emp_name, int dept_id) {
        LocalDateTime now = LocalDateTime.now();
        Timestamp time = Timestamp.valueOf(now);

        this
            .setEmp_id(emp_id)
            .setEmp_name(emp_name)
            .setDept_id(dept_id)
            .setRegistered_date(time);
    }

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
}
