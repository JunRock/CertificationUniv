package io.junseok.authuniversity.service.univmail;

import io.junseok.authuniversity.config.mail.SendMailService;
import io.junseok.authuniversity.config.mail.dto.UnivMailDto;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

import static io.junseok.authuniversity.domain.University.getDomainByName;

@Component
@RequiredArgsConstructor
public class AuthenticateMail {
    private final UniversityMailValidService mailValidService;
    private final SendMailService sendMailService;
    private String certificationNumber;
    public String sendNumber(String email,String universityName) throws MessagingException { //실 서비스
        if (!mailValidService.checkMail(email))
            throw new IllegalStateException("이메일 검증 실패");
        email= MessageFormat.format("{0}@{1}.ac.kr", email,getDomainByName(universityName));
        UnivMailDto univMailDto = sendMailService.createCertificationNumber(email);
        sendMailService.mailSend(univMailDto); //메일 전송
        certificationNumber =sendMailService.getTempPassword();
        return certificationNumber;
    }

    public String checkCertificationNumber(String number){  //사용자가 입력한 인증번호와 전송된 인증번호와 동일한지 확인
        if(number.equals(certificationNumber)){
            return "이메일 인증에 성공하였습니다!";
        }
        else {
            return "이메일 인증에 실패하였습니다!";
        }
    }
}
