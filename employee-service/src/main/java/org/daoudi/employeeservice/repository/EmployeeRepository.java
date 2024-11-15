package org.daoudi.employeeservice.repository;

import org.daoudi.employeeservice.dto.EmployeeDto;
import org.daoudi.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByDepartmentId(Long departmentId);
}

