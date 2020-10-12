package br.com.afcl.di.service;

import br.com.afcl.di.repository.GreetingRepository;

/**
 * @author André Felipe C. Leite
 * @version 1.0
 * @since 12/10/2020 - 15:06
 */
public class PrimaryBrazilianPortugueseGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryBrazilianPortugueseGreetingService(final GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getBrazilianPortugueseGreeting();
	}
}
