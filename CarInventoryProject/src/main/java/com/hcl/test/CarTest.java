package com.hcl.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.hcl.dao.CarDao;
import com.hcl.model.Car;



public class CarTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		CarDao dao = (CarDao) ctx.getBean("cdao");
		
		  System.out.println(".....Welcome to Mullet Joe's Gently Used Autos....");
		    
			Scanner sc=new Scanner(System.in);
		    int ch;
		    while(true)
		    {
		      System.out.println("1.Add");
		      System.out.println("2.Update");
		      System.out.println("3.Delete");
		      System.out.println("4.List");
		      System.out.println("5.Quit");
	          System.out.println("Enter Your Choice:");
	          ch=sc.nextInt();
	          
	          switch(ch)
			  {
			   case 1: 
				   System.out.println("Enter The Car deatails...");
				   System.out.println("Enter the CarID:");
				   int id=sc.nextInt();
				   System.out.println("Enter Car Maker:");
				   String inMake=sc.next();
				   System.out.println("Enter Car Model:");
				   String inModel=sc.next();
				   System.out.println("Enter The car year:");
				   int inYears=sc.nextInt();
				   System.out.println("Enter The car SalesPrice $ :");
				   double inSalesPrice=sc.nextDouble();
			
				   dao.addCar(new Car(id, inMake, inModel, inYears, inSalesPrice));
			   break;
		
		/*int status=dao.addCar(new Car(2, "isuze", "trooper", 2003, 89765.98));
		System.out.println(status);
*/
			   case 2:
					System.out.println("Update The Car deatails...");
					System.out.println("Which car data You update:");
					int uid=sc.nextInt();
					System.out.println("Enter The CarMaker");
					String uMake=sc.next();
					System.out.println("Enter The car model:");
					String uModel=sc.nextLine();
					System.out.println("Enter The car year:");
					int uYear=sc.nextInt();
					System.out.println("Enter The car SalesPrice $ :");
					double uSalesPrice=sc.nextDouble();
			        int status=dao.updateCar(new Car(uid, uMake, uModel, uYear, uSalesPrice));
		            System.out.println(status); 
		       break;
		       
			   case 3:	   
				   Car cdd=new Car();
				   System.out.println("Which Data You Want To Remove");
				   int deletecar=sc.nextInt();
				   cdd.setCarID(deletecar);
				   int delete=dao.deleteCar(cdd);
				   System.out.println(delete);
			   break;
			   
			   case 4:
				  /* List<Car> list=dao.getAllData(); 
				    for(Car c:list)  
				        System.out.println(c);  
			   break;  */
				   
			   case 5:  System.exit(1);
		   		default : System.out.println("Invalid Choice \n");
		
		 

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
	}
	
}
	
