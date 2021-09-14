package servlet.enshu10_1.service;

import servlet.enshu10_1.dao.EmployeeDAO;
import servlet.enshu10_1.data.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    /**
     * 従業員をListとして全件返す
     */
    public List<Employee> findAll() throws SQLException, ClassNotFoundException {
        EmployeeDAO dao = new EmployeeDAO();
        return dao.findAll();
    }
}
