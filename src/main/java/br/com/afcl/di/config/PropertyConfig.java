package br.com.afcl.di.config;

import br.com.afcl.di.examplebeans.FakeDataSource;
import br.com.afcl.di.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author André Felipe C. Leite
 * @version 1.0
 * @since 10/10/2020 - 15:29
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
		@PropertySource("classpath:datasource.properties"),
		@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

	@Value("${afcl.username}")
	String username;
	@Value("${afcl.password}")
	String password;
	@Value("${afcl.dburl}")
	String url;

	@Value("${afcl.jms.username}")
	String jmsUsername;
	@Value("${afcl.jms.password}")
	String jmsPassword;
	@Value("${afcl.jms.dburl}")
	String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		return new FakeDataSource(username, password, url);
	}

	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		return new FakeJmsBroker(jmsUsername, jmsPassword, jmsUrl);
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
