package enshu06_1;

import java.time.LocalDateTime;

public class Employee {
  private int empId;
  private String empName;
  private int deptId;
  private LocalDateTime  registeredDate;
  private Department department;

  public int getEmpId() {
    return empId;
  }
  public void setEmpId(int empId) {
    this.empId = empId;
  }
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
  }
  public int getDeptId() {
    return deptId;
  }
  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }
  public LocalDateTime getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(LocalDateTime registeredDate) {
    this.registeredDate = registeredDate;
  }
  public Department getDepartment() {
    return department;
  }
  public void setDepartment(Department department) {
    this.department = department;
  }


}
