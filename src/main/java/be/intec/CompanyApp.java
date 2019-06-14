package be.intec;

import be.intec.controller.controller_impl.controller_interface.ServiceImpl;
import be.intec.dao.CompanyDaoImpl;
import be.intec.model.Company;

import java.sql.SQLException;

public class CompanyApp {
    public static void main(String[] args) {
    //    CompanyDaoImpl companyDao = new CompanyDaoImpl();

        ServiceImpl service = new ServiceImpl();

        Company c = new Company("IBM","BE7878787","CHICAGO","US");
        try {
           // service.create(c);
            service.read(c.getId());
            service.update(c.setId(2));
            System.out.println(service.read(2));


        } catch (SQLException e) {
            e.printStackTrace();
        }


/*   try {
            companyDao.create(new Company("INTEC","BE123456789","RUPPLE","BXL"));
        } catch (SQLException e) {
            e.printStackTrace();
        }*/





try {
    System.out.println(service.read(10));

    service.delete(service.read(7));

  //  companyDao.update(1);




} catch (SQLException e) {
    e.printStackTrace();
}





    }


}


