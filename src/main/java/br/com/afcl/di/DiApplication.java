package br.com.afcl.di;

import br.com.afcl.di.controller.ConstructorInjectedController;
import br.com.afcl.di.controller.GetterInjectedController;
import br.com.afcl.di.controller.MyController;
import br.com.afcl.di.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		final ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		final MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
