package br.com.afcl.di.examplebeans;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author André Felipe C. Leite
 * @version 1.0
 * @since 11/10/2020 - 13:03
 */
@RequiredArgsConstructor
@Getter
@ToString(includeFieldNames = true)
public class FakeJmsBroker {
	private final String username;
	private final String password;
	private final String url;
}
