package com.aburilovic.springdidemo;

import com.aburilovic.springdidemo.controllers.ConstructorInjectedController;
import com.aburilovic.springdidemo.controllers.MyController;
import com.aburilovic.springdidemo.controllers.PropertyInjectedController;
import com.aburilovic.springdidemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
