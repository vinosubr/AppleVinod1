package com.telusko.session12.model;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	public List<Alien> findById(int id);
	
	//@Query("select a from Alien a where a.age <= ?")
    public List<Alien> findByAgeLessThanEqual (int age);    
    
}
