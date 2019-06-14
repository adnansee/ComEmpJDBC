package be.intec.dao_interface;

import be.intec.model.Company;
import be.intec.model.Employee;

import java.sql.SQLException;

public interface EmployeeDao {

    void create(Employee employee) throws SQLException;

    Employee read (int id)throws SQLException;

    void update(Employee employee) throws SQLException;

    void delete(Employee employee) throws SQLException;
}
