package com.example.demo.Controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Integer>  {
	@Query("SELECT new com.example.demo.Controller.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d LEFT JOIN d.employee e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();

	@Query("SELECT new com.example.demo.Controller.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d RIGHT JOIN d.employee e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();

}
