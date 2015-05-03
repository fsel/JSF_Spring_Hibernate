package com.springhibernatejsf.dao;

import java.util.List;

import com.springhibernatejsf.model.Person;

public interface PersonDAO {
	
	public void addPerson(Person p);
	public List<Person> listPersons();

}
