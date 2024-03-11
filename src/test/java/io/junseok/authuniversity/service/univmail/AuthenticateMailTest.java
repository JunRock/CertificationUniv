package io.junseok.authuniversity.service.univmail;

import jakarta.mail.MessagingException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthenticateMailTest {
    @Autowired
    AuthenticateMail authenticateMail;
    @Test
    void checkCertificationNumber() throws MessagingException {
        String number = authenticateMail.sendCertificationNumber("wnstjr1204","순천향대");
        authenticateMail.checkCertificationNumber(number);
        Assertions.assertThat(authenticateMail.checkCertificationNumber(number)).isEqualTo("이메일 인증에 성공하였습니다!");
    }
}