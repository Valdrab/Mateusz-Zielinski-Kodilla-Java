package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyEmployeeFacade.class);

    public List<Company> findCompanyByNameFragment(String nameFragment) {
        LOGGER.info("Searching for companies names containing " + nameFragment + " ...");
        List<Company> foundCompanies = companyDao.retrieveCompaniesByNameFragment(nameFragment);
        LOGGER.info("Found " + foundCompanies.size() + " companies matching the criteria.");
        return foundCompanies;
    }

    public List<Employee> findEmployeeByNameFragment(String nameFragment) {
        LOGGER.info("Searching for employees that first or last names contain " + nameFragment + " ...");
        List<Employee> foundEmployees = employeeDao.retrieveEmployeesByNameFragment(nameFragment);
        LOGGER.info("Found " + foundEmployees.size() + " employees matching the criteria.");
        return foundEmployees;
    }
}
