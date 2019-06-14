package be.intec.dao;

import be.intec.dao_interface.EmployeeDao;
import be.intec.model.Company;
import be.intec.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao  {
    private Connection createConnection() {
        return ConnectionProvider.getInstance().getConnection();
    }
    @Override
    public void create(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = createConnection().prepareStatement("INSERT INTO comapany_demo.employee(firstName,lastName,department,companyId) VALUES (?,?,?,?)");
        preparedStatement.setString(1,employee.getFirstName());
        preparedStatement.setString(2,employee.getLastName());
        preparedStatement.setString(3,employee.getDepartment());
        preparedStatement.setInt(4,employee.getCompanyId().getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public Employee read(int id) throws SQLException {
        PreparedStatement preparedStatement = createConnection().prepareStatement("SELECT * FROM comapany_demo.employee WHERE id =?");
        preparedStatement.setInt(1,id);
        ResultSet rs = preparedStatement.executeQuery();
        Employee employee = new Employee();
        while (rs.next()){

            employee.setId(rs.getInt("id"));
            employee.setFirstName(rs.getString("firstName"));
            employee.setLastName(rs.getString("lastName"));
            employee.setDepartment(rs.getString("department"));
            employee.setCompanyId(new Company().setId(rs.getInt("companyId")));
        }
        return null;
    }

    @Override
    public void update(Employee company) throws SQLException {

    }

    @Override
    public void delete(Employee company) throws SQLException {

    }
}
