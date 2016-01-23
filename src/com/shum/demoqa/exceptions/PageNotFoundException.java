package com.shum.demoqa.exceptions;

import org.openqa.selenium.NoSuchElementException;

public class PageNotFoundException extends NoSuchElementException {

	private static final long serialVersionUID = 1L;

	public PageNotFoundException(String reason) {
		super(reason);
	
	}

	@Override
	public String getSupportUrl() {
		
		return super.getSupportUrl();
	}
	


}
