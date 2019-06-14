package be.intec.model;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private Company companyId;

    public Employee(String firstName, String lastName, String department, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.companyId = company;
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, firstName='%s', lastName='%s', department='%s', companyId=%s}", id, firstName, lastName, department, companyId);
    }
}
