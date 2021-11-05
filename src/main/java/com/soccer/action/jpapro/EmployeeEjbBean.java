package com.soccer.action.jpapro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeEjbBean implements EmployeeEjbI {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employee save(Employee employee) throws Exception {
        return entityManager.find(Employee.class, employee);
    }

    @Override
    public Employee findEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        if (employee != null) {
            entityManager.remove(employee);
        }
        return employee;
    }

    @Override
    public Employee updateSalary(long sal) {
        Employee employee = entityManager.find(Employee.class, sal);
        employee.setSalary(employee.getSalary() + 1000);
        return employee;
    }

    @Override
    public Employee raiseSalary(int id, long expectedSalary) {
        Employee employee = entityManager.find(Employee.class, id);
        if (employee != null) {
            employee.setSalary(employee.getSalary() + expectedSalary);
        }
        return employee;
    }

    @Override
    public List<Employee> listAll() {
        String query = "SELECT e FROM Employee e";
        TypedQuery<Employee> employeeTypedQuery = entityManager.createQuery(query, Employee.class);
        List<Employee> employees = employeeTypedQuery.getResultList();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        return employees;
    }


}
