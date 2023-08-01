package com.ssd.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailApplication {

	@Autowired
	public EmailService emailService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
		
	
	}

	@EventListener(ApplicationReadyEvent.class)
	public void mailmessage() {
		emailService.sendMail("@gmail.com", "", "");
		
	}
}
