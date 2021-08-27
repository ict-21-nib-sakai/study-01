/**
 * 従業員
 */
public class Employee extends GeneralEmployee {
    /** 残業代 */
    private int overwork_pay;

    @Override
    public int getSalary() {
        System.out.println("Employee getSalary");

        /** 基本給*/
        int salary = super.getSalary();

        /** 基本給 + 残業代 */
        int employeeSalary = salary + this.overwork_pay;

        return employeeSalary;
    }
}
