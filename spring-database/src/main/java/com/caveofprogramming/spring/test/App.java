package com.caveofprogramming.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/test/beans/beans.xml");

		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

		try {
			
			Offer offer1 = new Offer(5, "Rajesh", "rajesh@rajeshsurana.com", "Coding");
			Offer offer2 = new Offer(6, "Dav", "dav@rajeshsurana.com", "Web Development");
			offersDao.create(offer1);
			offersDao.create(offer2);

			List<Offer> offers = offersDao.getOffers();
			for (Offer offer : offers) {
				System.out.println(offer);
			}
			
			//Offer offer = offersDao.getOffer(2);
			//System.out.println("Mike : " + offer);

		} catch (CannotGetJdbcConnectionException ex) {
			System.out.println("Can not get JDBC Connection");

		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}

		((ClassPathXmlApplicationContext) context).close();
	}

}
