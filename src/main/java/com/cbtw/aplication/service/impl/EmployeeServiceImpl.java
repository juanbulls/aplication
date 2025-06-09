package com.cbtw.aplication.service.impl;

import com.cbtw.aplication.dto.EmployeeDto;
import com.cbtw.aplication.entity.Employee;
import com.cbtw.aplication.mapper.EmployeeMapper;
import com.cbtw.aplication.repository.EmployeeRepository;
import com.cbtw.aplication.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
