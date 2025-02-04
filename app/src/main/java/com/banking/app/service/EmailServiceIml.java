package com.banking.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.banking.app.dto.EmailDetails;

@Service
public class EmailServiceIml implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String senderEmail;

	@Override
	public void sendEmailAlert(EmailDetails emailDetails) throws RuntimeException {
		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setFrom(senderEmail);
			mailMessage.setTo(emailDetails.getRecipient());
			mailMessage.setText(emailDetails.getMessageBody());
			mailMessage.setSubject(emailDetails.getSubject());

			javaMailSender.send(mailMessage);
			System.out.println("Mail sent successfully!");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}
}
