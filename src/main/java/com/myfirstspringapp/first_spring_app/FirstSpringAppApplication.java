package com.myfirstspringapp.first_spring_app;

import com.myfirstspringapp.first_spring_app.model.Address;
import com.myfirstspringapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan
//@EnableAutoConfiguration
//@Configuration
@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello all, this is out first spring boot app!");



		// tight coupling example
//		Employee employee1 = new Employee();
//		employee1.id = 123;
//		employee1.name="Ajay";
//		employee1.email="ajay123@gmail.com";
//		employee1.mobile="8765432221";
//
//		Address address1 = new Address();
//		address1.doorNo=345;
//		address1.streetName="random street";
//		address1.city = "random city";
//

//		address1.streetName="changing street";
//		employee1.address=address1;


		// loose coupling using setter injection
		Employee employee1 = new Employee();
		employee1.setId(123);
		employee1.setName("Ajay");
		employee1.setEmail("ajay123@gmail.com");
		employee1.setMobile("91872272829");

		Address address1 = new Address();
		address1.setDoorNo(222);
		address1.setStreetName("iwowoo");
		address1.setCity("eieiekki");

		employee1.setAddress(address1);

		employee1.getAddress().setStreetName("yiuuoo");
	}

}
