/*
 * @(#)GreetingServiceFactory.java 1.0 28/09/2020
 *
 * Copyright (c) 2020, Embraer. All rights reserved. Embraer S/A
 * proprietary/confidential. Use is subject to license terms.
 */
package br.com.afcl.di.services;


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
			case "en":
				return new PrimaryGreetingService(greetingRepository);
			case "es":
				return new PrimarySpanishGreetingService(greetingRepository);
			case "de":
				return new PrimaryGermanGreetingService(greetingRepository);
			default:
				return new PrimaryGreetingService(greetingRepository);
		}
	}

}