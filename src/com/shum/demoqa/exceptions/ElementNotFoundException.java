package com.shum.demoqa.exceptions;

import org.openqa.selenium.NoSuchElementException;

public class ElementNotFoundException extends NoSuchElementException {

	private static final long serialVersionUID = 1L;

	public ElementNotFoundException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public ElementNotFoundException(String reason, Throwable cause) {
		super(reason, cause);
	}

}
