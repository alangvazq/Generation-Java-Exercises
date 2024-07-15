package org.generation.ecommerce.dto;

public class Token {
	private final String accessToken;

	public Token(String accessToken) {
		super();
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

}
