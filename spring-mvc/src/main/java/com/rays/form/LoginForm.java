package com.rays.form;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {

	@NotEmpty(message = "login is required")
	private String login;

	@NotEmpty(message = "password is required")
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}