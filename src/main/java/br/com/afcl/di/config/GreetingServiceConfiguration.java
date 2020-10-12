/*
 * @(#)GreetingServiceConfiguration.java 1.0 28/09/2020
 *
 * Copyright (c) 2020, Embraer. All rights reserved. Embraer S/A
 * proprietary/confidential. Use is subject to license terms.
 */
package br.com.afcl.di.config;

import br.com.afcl.di.repository.GreetingRepository;
import br.com.afcl.di.service.GreetingService;
import br.com.afcl.di.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @author andrelei - André Felipe C. Leite
 * @version 1.0 28/09/2020
 */
@Configuration
public class GreetingServiceConfiguration {

	@Bean
	public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
		return new GreetingServiceFactory(greetingRepository);
	}

	@Bean
	@Primary
	@Profile({"en", "default"})
	public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("EN");
	}

	@Bean
	@Primary
	@Profile({"es"})
	public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("ES");
	}

	@Bean
	@Primary
	@Profile({"de"})
	public GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("DE");
	}

	@Bean
	@Primary
	@Profile({"pt_br"})
	public GreetingService primaryBrazilianPortugueseGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("PT_BR");
	}

}