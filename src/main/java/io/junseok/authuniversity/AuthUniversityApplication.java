package io.junseok.authuniversity;

import io.junseok.authuniversity.domain.University;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

import static io.junseok.authuniversity.domain.University.UNIV_MAP;
import static io.junseok.authuniversity.domain.University.getDomainByName;

@SpringBootApplication
public class AuthUniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthUniversityApplication.class, args);
	}
}
