package com.example.crudoperations;
import org.springframework.data.repository.CrudRepository;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}