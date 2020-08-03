package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CompanyEmployeeFacadeTestSuite {
    @Autowired
    private CompanyEmployeeFacade companyEmployeeFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindCompanyByNameFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company dataMiners = new Company("Data Miners");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(dataMiners);

        //When
        List<Company> companies = companyEmployeeFacade.findCompanyByNameFragment("war");

        //Then
        Assert.assertEquals(1, companies.size());

        //CleanUp
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
        companyDao.delete(dataMiners);
    }

    @Test
    public void testFindEmployeeByNameFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee stephanieSmith = new Employee("Stephanie", "Smith");

        employeeDao.save(johnSmith);
        int johnId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();
        employeeDao.save(stephanieSmith);
        int stephanie2Id = stephanieSmith.getId();

        //When
        List<Employee> namesStephanieList = companyEmployeeFacade.findEmployeeByNameFragment("Steph");

        //Then
        Assert.assertEquals(2, namesStephanieList.size());

        //CleanUp
        employeeDao.deleteById(johnId);
        employeeDao.deleteById(stephanieId);
        employeeDao.deleteById(lindaId);
        employeeDao.deleteById(stephanie2Id);
        }
}
