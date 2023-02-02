package com.example.pagination.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findPaginated(int pageNo, int pageSize) {

        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Country> pagedResult = repository.findAll(paging);

        return pagedResult.toList();
    }
    
    @Override
    public List<Country> sortbyfields(int pageNo, int pageSize,  String fieldname) {

        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(fieldname));
        Page<Country> pagedResult = repository.findAll(paging);

        return pagedResult.toList();
    }
    
    @Override
    public List<Country> findSortedByName(String countryname) {
    	return repository.FindbyData(countryname);
    	}





}
