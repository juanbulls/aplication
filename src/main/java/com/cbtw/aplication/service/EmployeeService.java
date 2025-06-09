package com.cbtw.aplication.service;

import com.cbtw.aplication.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {

    // Pregunta que me falto responder, Coupling vs Cohersion, es que tan bien esta implementada la single
    // responsability o el nivel de interdependencia que puede haber entre los modulos. Esta pregunta salio luego de
    // explicar el race condition, yo explique como lo solucione, pero no hable sobre que me di cuenta que una falla
    // fue la falta de principios SOLID, especificamente el primero. Pero es la primera vez que oia literalmente,
    // el termino coupling vs cohersion.

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees(); // New method to retrieve all employees

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);

    void deleteEmployee(Long employeeId);
}
