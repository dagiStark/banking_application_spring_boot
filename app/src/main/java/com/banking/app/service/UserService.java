package com.banking.app.service;

import com.banking.app.dto.BankResponse;
import com.banking.app.dto.UserRequest;

public interface UserService {

	BankResponse createAccount(UserRequest userRequest);
}
