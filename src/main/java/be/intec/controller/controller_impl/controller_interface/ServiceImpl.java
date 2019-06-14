package be.intec.controller.controller_impl.controller_interface;

import be.intec.dao.CompanyDaoImpl;
import be.intec.model.Company;

import java.sql.SQLException;

public class ServiceImpl implements Service {
    private CompanyDaoImpl companyDao = new CompanyDaoImpl();


    @Override
    public void create(Company company) throws SQLException {
        companyDao.create(company);
    }

    @Override
    public Company read(int id) throws SQLException {
        return companyDao.read(id);
    }

    @Override
    public void update(Company company) throws SQLException {
    companyDao.update(company);
    }

    @Override
    public void delete(Company company) throws SQLException {
    companyDao.delete(company);
    }
}
