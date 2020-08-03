package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
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
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(dataMaestersId);
        companyDao.deleteById(greyMatterId);
    }

    @Test
    public void testRetrieveEmployeesByLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee walterSmith = new Employee("Walter", "Smith");

        employeeDao.save(johnSmith);
        int johnId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();
        employeeDao.save(walterSmith);
        int walterId = walterSmith.getId();

        //When
        List<Employee> theSmiths = employeeDao.retrieveEmployeesByLastName("Smith");

        //Then
        Assert.assertEquals(2, theSmiths.size());

        //CleanUp
        employeeDao.deleteById(johnId);
        employeeDao.deleteById(stephanieId);
        employeeDao.deleteById(lindaId);
        employeeDao.deleteById(walterId);
    }

    @Test
    public void testRetrieveEmployeesByNameFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee walterSmith = new Employee("Walter", "Smith");

        employeeDao.save(johnSmith);
        int johnId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();
        employeeDao.save(walterSmith);
        int walterId = walterSmith.getId();

        //When
        List<Employee> ndas = employeeDao.retrieveEmployeesByNameFragment("nda");

        //Then
        Assert.assertEquals(1, ndas.size());

        //CleanUp
        employeeDao.deleteById(johnId);
        employeeDao.deleteById(stephanieId);
        employeeDao.deleteById(lindaId);
        employeeDao.deleteById(walterId);
    }

    @Test
    public void testRetrieveCompaniesByFirstThreeChars() {
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
        List<Company> datCompanies = companyDao.retrieveCompaniesByFirstThreeChars("Dat");

        //Then
        Assert.assertEquals(2, datCompanies.size());

        //CleanUp
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
        companyDao.delete(dataMiners);
    }

    @Test
    public void testRetrieveCompaniesByNameFragment() {
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
        List<Company> companies = companyDao.retrieveCompaniesByNameFragment("Ma");

        //Then
        Assert.assertEquals(3, companies.size());

        //CleanUp
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
        companyDao.delete(dataMiners);
    }
}
