package com.hcl.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		CarDao dao = (CarDao) ctx.getBean("cdao");

		/*
		 * int status=dao.addCar(new Car(2, "Isuze", "Trooper", 2002, 2599.00));
		 * System.out.println(status);
		 */

		/*
		 * int status=dao.updateCar(new Car(2,"TATA", "Hexa", 2019, 20599.99));
		 * System.out.println(status);
		 */

		/*
		 * Car c= new Car(); c.setCarID(2);
		 * 
		 * int status=dao.deleteCar(c); System.out.println(status);
		 */

	}

}
