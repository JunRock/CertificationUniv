package io.junseok.authuniversity;

import io.junseok.authuniversity.service.univmail.ValidMailLength;
import io.junseok.authuniversity.service.univmail.ValidSpecialWord;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthUniversityApplicationTests {

	@Autowired
	ValidSpecialWord validSpecialWord;

	@Autowired
	ValidMailLength validMailLength;

	@Test
	void contextLoads() {
		String mail="junseok";
		Assertions.assertThat(validSpecialWord.checkContainSpecialWord(mail)).isEqualTo(true);
	}

/*
	@Test
	void contextLoads1() {
		String mail="j";
		Assertions.assertThat(validMailLength.checkLength(mail)).isTrue();
	}

 */
}
