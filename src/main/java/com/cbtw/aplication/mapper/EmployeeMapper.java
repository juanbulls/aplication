package com.cbtw.aplication.mapper;

import com.cbtw.aplication.dto.EmployeeDto;
import com.cbtw.aplication.entity.Employee;

public class EmployeeMapper {

    // To DTO hacia el objeto que se usa para entregar al cliente
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    // to employee en el sentido contrario, para enregar a la base de datos
    public static Employee mapToEmployee(Employee employee) {
        return new Employee(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
}
