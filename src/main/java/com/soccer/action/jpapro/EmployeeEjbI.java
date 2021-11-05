package com.soccer.action.jpapro;

import java.util.List;

public interface EmployeeEjbI {
    Employee save (Employee employee) throws Exception;

    Employee findEmployee(int id);

    Employee removeEmployee(int id);

    Employee updateSalary(long sal);

    Employee raiseSalary(int id, long expectedSalary);

    List<Employee> listAll();

}
