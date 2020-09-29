/*
 * @(#)MyController.java 1.0 30/06/2020
 *
 * Copyright (c) 2019, Embraer. All rights reserved. Embraer S/A
 * proprietary/confidential. Use is subject to license terms.
 */
package br.com.afcl.di.controller;

import br.com.afcl.di.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author andrelei - André Felipe C. Leite
 * @version 1.0 30/06/2020
 */
@Controller public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello(){
		System.out.println("Hello!!! ");

		return greetingService.sayGreeting();
	}

}
