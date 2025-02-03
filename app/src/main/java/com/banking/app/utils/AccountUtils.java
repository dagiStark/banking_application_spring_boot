package com.banking.app.utils;

import java.time.Year;

public class AccountUtils {

	public static final String ACCOUNT_EXISTS_CODE = "001";
	public static final String ACCOUNT_EXISTS_MESSAGE = "User already exists!";
	public static final String ACCOUNT_CREATION_SUCCESS_CODE = "002";
	public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Successfuly created an account!";

	public static String generateAccountNumber() {
		Year currentYear = Year.now();
		int min = 100_000;
		int max = 999_999;
		int randomNumber0 = (int) Math.floor(Math.random() * (max - min + 1) + min);

		String year = String.valueOf(currentYear);
		String randomNumber = String.valueOf(randomNumber0);
		StringBuilder accountNumber = new StringBuilder();

		return accountNumber.append(year).append(randomNumber).toString();
	}

}
