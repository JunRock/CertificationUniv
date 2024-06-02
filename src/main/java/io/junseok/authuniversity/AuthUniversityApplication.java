package io.junseok.authuniversity;

import io.junseok.authuniversity.service.univmail.AuthenticateMail;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.MessagingException;

@SpringBootApplication
@RequiredArgsConstructor
public class AuthUniversityApplication {
private static final AuthenticateMail authenticateMail = null;
	public static void main(String[] args) throws MessagingException {
		SpringApplication.run(AuthUniversityApplication.class,  args);
		authenticateMail.sendNumber("wnstjr1204","순천향대학교");
	}
}
