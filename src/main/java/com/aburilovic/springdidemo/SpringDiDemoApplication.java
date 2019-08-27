package com.aburilovic.springdidemo;

import com.aburilovic.springdidemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}

}
