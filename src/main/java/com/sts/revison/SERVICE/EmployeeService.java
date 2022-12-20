package com.sts.revison.SERVICE;

import com.sts.revison.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
}
