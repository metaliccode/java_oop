package inixindo.application;

import inixindo.inner_class.Company;

public class CompanyApp {
    public static void main(String[] args) {

        // cara pemanggilan inner class
        Company company = new Company();
        company.setName("Inixindo");

        Company.Employee employee = company.new Employee();
        employee.setName("Ihsan Miftahul Huda");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Rine");
        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
