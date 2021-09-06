package dao;

import java.util.List;

public class DepartmentClient {
    public static void main(String[] args){
        DepartmentDAO dao = new DepartmentDAO();
        List<Department> list = dao.findAll();

        for (Department department : list) {
            System.out.println(department.getDept_id());
            System.out.println(department.getDept_name());
        }
    }
}
