/*
 * @(#)GreetingServiceFactory.java 1.0 28/09/2020
 *
 * Copyright (c) 2020, Embraer. All rights reserved. Embraer S/A
 * proprietary/confidential. Use is subject to license terms.
 */
package br.com.afcl.di.service;


import br.com.afcl.di.repository.GreetingRepository;

/**
 * @author andrelei - André Felipe C. Leite
 * @version 1.0 28/09/2020
 */
public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(final GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(final String lang) {
		switch (lang){
			case "EN":
				return new PrimaryGreetingService(greetingRepository);
			case "ES":
				return new PrimarySpanishGreetingService(greetingRepository);
			case "DE":
				return new PrimaryGermanGreetingService(greetingRepository);
			case "PT_BR":
				return new PrimaryBrazilianPortugueseGreetingService(greetingRepository);
			default:
				return new PrimaryGreetingService(greetingRepository);
		}
	}

}