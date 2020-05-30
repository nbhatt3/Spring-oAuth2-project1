package com.nitinbhatt.springoAuthproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTrace.Principal;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringOAuthProjectApplication {

	@GetMapping("/")
	public String message (Principal principal) {	
			
			return ("Hi "+ principal.getName()+" Welcome to SpringOAuth2 Example Application");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringOAuthProjectApplication.class, args);
	}

}
