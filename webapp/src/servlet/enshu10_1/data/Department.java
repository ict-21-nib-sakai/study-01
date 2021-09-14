package servlet.enshu10_1.data;

public class Department {
    /** 部署ID */
    private int deptId;

    /** 部署名 */
    private String deptName;

    public int getDeptId() {
        return deptId;
    }

    public Department setDeptId(int deptId) {
        this.deptId = deptId;
        return this;
    }

    public String getDeptName() {
        return deptName;
    }

    public Department setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
}
