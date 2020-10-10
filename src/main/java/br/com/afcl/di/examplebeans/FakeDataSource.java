package br.com.afcl.di.examplebeans;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author André Felipe C. Leite
 * @since  10/10/2020
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
@ToString(includeFieldNames = true)
public class FakeDataSource {
	private final String user;
	private final String password;
	private final String url;
}
