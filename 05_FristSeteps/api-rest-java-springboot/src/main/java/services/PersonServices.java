package services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById(String id) {
		logger.info("Finding person");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Adalgisio");
		person.setLastName("Figueiredo");
		person.setAddress("Rua S Jose, N44 Vilas do Atlantico Lauro de Freitas");
		person.setGender("M");
		return person;
		
	}
}
