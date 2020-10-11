package br.com.afcl.di;

import br.com.afcl.di.controller.MyController;
import br.com.afcl.di.examplebeans.FakeDataSource;
import br.com.afcl.di.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		final ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		final MyController controller = (MyController) ctx.getBean("myController");

		final FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean("fakeDataSource");
		System.out.println(fakeDataSource);

		final FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean("fakeJmsBroker");
		System.out.println(fakeJmsBroker);
	}

}
