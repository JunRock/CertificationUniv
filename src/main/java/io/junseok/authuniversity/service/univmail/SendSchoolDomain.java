package io.junseok.authuniversity.service.univmail;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

import static io.junseok.authuniversity.domain.University.getDomainByName;

@Service
public class SendSchoolDomain {
    public String sendDomain(String schoolName){
        return MessageFormat.format("@{0}.ac.kr",getDomainByName(schoolName));
    }
}
