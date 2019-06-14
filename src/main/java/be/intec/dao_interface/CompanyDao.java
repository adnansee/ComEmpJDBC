package be.intec.dao_interface;

import be.intec.model.Company;

import java.sql.SQLException;

public interface CompanyDao {

    void create(Company company) throws SQLException;
    Company read (int id)throws SQLException;


    void update(Company company) throws SQLException;

    void delete(Company company) throws SQLException;
}
