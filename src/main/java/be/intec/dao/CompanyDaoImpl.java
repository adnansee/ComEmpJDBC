package be.intec.dao;

import be.intec.dao_interface.CompanyDao;
import be.intec.model.Company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyDaoImpl implements CompanyDao {
    private Connection createConnection() {
        return ConnectionProvider.getInstance().getConnection();
    }

    @Override
    public void create(Company company) throws SQLException {

        PreparedStatement preparedStatement = createConnection().prepareStatement("INSERT INTO comapany_demo.company(name, vat, address, city) VALUES (?,?,?,?)");
        preparedStatement.setString(1, company.getName());
        preparedStatement.setString(2, company.getVat());
        preparedStatement.setString(3, company.getAddress());
        preparedStatement.setString(4, company.getCity());

        preparedStatement.executeUpdate();
        preparedStatement.close();
    }


    @Override
    public Company read(int id) throws SQLException {
        PreparedStatement preparedStatement = createConnection().prepareStatement("SELECT * FROM comapany_demo.company WHERE id= ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Company company = new Company();
        while (resultSet.next()) {
            company.setId(resultSet.getInt("id"));
            company.setName(resultSet.getString("name"));
            company.setAddress(resultSet.getString("address"));
            company.setVat(resultSet.getString("vat"));
            company.setCity(resultSet.getString("city"));
        }
        return company;
    }


    @Override
    public void update(Company company) throws SQLException {
        PreparedStatement preparedStatement = createConnection().prepareStatement("UPDATE comapany_demo.company SET name = ?, vat = ?, address = ?, city = ? WHERE id = ?");
        preparedStatement.setString(1, company.getName());
        preparedStatement.setString(2, company.getVat());
        preparedStatement.setString(3, company.getCity());
        preparedStatement.setString(4, company.getAddress());
        preparedStatement.setInt(5, company.getId());
    }

    @Override
    public void delete(Company company) throws SQLException {
        PreparedStatement preparedStatement = createConnection().prepareStatement("DELETE FROM comapany_demo.company WHERE id = ?");
        preparedStatement.setInt(1,company.getId());
        preparedStatement.executeUpdate();
    }
}
