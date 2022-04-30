package com.springdi.springdi;

import com.springdi.springdi.controllers.ConstructorInjectedController;
import com.springdi.springdi.controllers.PrimaryBeanInjectedController;
import com.springdi.springdi.controllers.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		System.out.println("---Primary Bean---");
		PrimaryBeanInjectedController primaryBean = (PrimaryBeanInjectedController)ctx.getBean("primaryBeanInjectedController");
		System.out.println(primaryBean.getGreeting());

		System.out.println("---Setter Injected Bean---");
		SetterInjectedController setterController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterController.getGreeting());

		System.out.println("---Constructor Injected Bean---");
		ConstructorInjectedController constructorController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorController.getGreeting());


	}

}
