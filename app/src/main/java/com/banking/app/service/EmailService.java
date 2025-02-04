package com.banking.app.service;

import com.banking.app.dto.EmailDetails;

public interface EmailService {
	void sendEmailAlert(EmailDetails emailDetails);

}
