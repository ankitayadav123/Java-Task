package com.example.pagination.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ICountryService countryService;

    @GetMapping("/countries/{pageNo}/{pageSize}")
    public List<Country> getPaginatedCountries(@PathVariable int pageNo, 
            @PathVariable int pageSize) {

        return countryService.findPaginated(pageNo, pageSize);
    }
    
    @GetMapping("/countries/{pageNo}/{pageSize}/{fieldname}")
    public List<Country> sortbyfields(@PathVariable int pageNo, 
            @PathVariable int pageSize,@PathVariable String fieldname ) {

        return countryService.sortbyfields(pageNo, pageSize, fieldname);
    }
    
    @GetMapping("/countries/{countryname}")
    public List<Country> getSortedBy(@PathVariable String countryname) {
    	return countryService.findSortedByName(countryname);
    	}



}
