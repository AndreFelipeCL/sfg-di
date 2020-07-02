package br.com.afcl.di;

import br.com.afcl.di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication public class DiApplication {

	public static void main(String[] args) {
		final ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		final String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
