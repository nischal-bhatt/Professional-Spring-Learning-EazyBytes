package com.example.main;

import java.util.Scanner;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.DinnerMeal;
import com.example.beans.Movie;
import com.example.beans.PrototypeBeanAndNotSingleton;
import com.example.beans.PrototyperScoper;
import com.example.beans.Song;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("app starting....");
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Honda City");
		System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
		/*
		 * The var keyword was introduced in Java 10. Type inference is used in var
		 * keyword in which it detects automatically the datatype of a variable based on
		 * the surrounding context.
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Vehicle veh = context.getBean("ferr", Vehicle.class);
		Vehicle veh2 = (Vehicle) context.getBean("vehiclez");
		Vehicle veh3 = (Vehicle) context.getBean(Vehicle.class);
		System.out.println("Vehicle name from Spring Context is: " + veh.getName());
		System.out.println("Primary bean - Vehicle name from Spring Context is: " + veh3.getName());

		/*
		 * We don’t need to do any explicit casting while fetching a bean from
		 * context. Spring is smart enough to look for a bean of the type you requested
		 * in its context. If such a bean doesn’t exist,Spring will throw an
		 * exception.
		 */
		String hello = context.getBean(String.class);
		System.out.println("String value from Spring Context is: " + hello.length());
		Integer num = context.getBean(Integer.class);
		System.out.println("Integer value from Spring Context is: " + num.toString().length());
		// context.close();
		Movie mov = context.getBean(Movie.class);
		System.out.println(mov.getName());
		mov.printMovie();

		Song dildooba = new Song();
		dildooba.setName("dildooba");
		Supplier<Song> songSupplier = () -> dildooba;

		System.out.println("type true or false");
		Scanner scanner = new Scanner(System.in);
		String trueOrFalse = scanner.nextLine();
		boolean trueOrFalseBool;
		if (trueOrFalse.equals("true")) {
			trueOrFalseBool = true;
		} else {
			trueOrFalseBool = false;
		}
		if (trueOrFalseBool) {
			context.registerBean("dil", Song.class, songSupplier);

		}

		if (trueOrFalseBool) {
			Song s = (Song) context.getBean("dil");

			s.printHelloWorld();
		} else {
			System.out.println("selected false, program closing");
		}

		DinnerMeal dm = (DinnerMeal)context.getBean("dinnermeal");
		dm.displayBeer();
		DinnerMeal dm2 = (DinnerMeal)context.getBean("dinnermeal");
		
		System.out.println(dm); //singleton
		System.out.println(dm2);
		ClassPathXmlApplicationContext xxx  = new ClassPathXmlApplicationContext("beans.xml");
		Song songer = (Song)xxx.getBean("song1");
		songer.printHelloWorld();
		
		PrototypeBeanAndNotSingleton a = (PrototypeBeanAndNotSingleton)context.getBean("ori");
		
		PrototyperScoper b = (PrototyperScoper)context.getBean(PrototyperScoper.class);
		PrototyperScoper c = (PrototyperScoper)context.getBean(PrototyperScoper.class);
		
		System.out.println(b); //prototype
		System.out.println(c);
		
		xxx.close();
		context.close();

	}
}
