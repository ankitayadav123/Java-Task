package com.example.demo.Controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("SELECT new com.example.demo.Controller.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d INNER JOIN d.employee e")
	List<DeptEmpDto> fetchEmpDeptDataInnerJoin();

	@Query("SELECT new com.example.demo.Controller.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d JOIN d.employee e")
	List<DeptEmpDto> fetchEmpDeptDataCrossJoin();

}