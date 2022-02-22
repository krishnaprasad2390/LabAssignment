package com.abc.lab1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.lab1.entity.Book;

public class Client {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Book book = new Book();
		book.setMessage("Welcome to JPA!");
		
		em.persist(book);
		
		System.out.println("Added greeting to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
