package com.springhibernatejsf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springhibernatejsf.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void addPerson(Person p){
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        session.flush();
        logger.info("Addition is successful!");
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
        Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
        for(Person p : personsList){
        }
        return personsList;
    }
}
