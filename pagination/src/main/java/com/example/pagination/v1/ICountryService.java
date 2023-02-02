package com.example.pagination.v1;

import java.util.List;

public interface ICountryService {

    List<Country> findPaginated(int pageNo, int pageSize);
    List<Country> sortbyfields(int pageNo, int pageSize, String fieldname);
    List<Country> findSortedByName(String countryname);





}
