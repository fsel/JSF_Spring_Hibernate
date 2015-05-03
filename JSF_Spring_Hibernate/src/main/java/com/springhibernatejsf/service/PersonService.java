package com.springhibernatejsf.service;

import java.util.List;

import com.springhibernatejsf.model.Person;

public interface PersonService {
	
	public void addPerson(Person p);
	public List<Person> listPersons();

}
