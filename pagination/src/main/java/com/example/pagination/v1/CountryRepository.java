package com.example.pagination.v1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface CountryRepository extends PagingAndSortingRepository<Country, Long> ,JpaRepository<Country, Long>{

	@Query("SELECT new com.example.pagination.v1.Country(c.id,c.name,c.population) FROM Country c WHERE name=:countryname ")
	List<Country>FindbyData(@Param("countryname") String countryname);
	}

