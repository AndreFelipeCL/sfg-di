package br.com.afcl.di.config;

import br.com.afcl.di.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author André Felipe C. Leite
 * @version 1.0
 * @since 10/10/2020 - 15:29
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${afcl.user}")
	String user;

	@Value("${afcl.password}")
	String password;

	@Value("${afcl.dburl}")
	String url;

	@Bean
	public FakeDataSource fakeDataSource() {
		return new FakeDataSource(user, password, url);
	}

	/*
	 * Required in earlier versions.
	 */
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer properties(){
//		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//		return configurer;
//	}

}
