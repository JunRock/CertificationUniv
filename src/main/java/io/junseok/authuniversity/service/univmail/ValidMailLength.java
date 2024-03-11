package io.junseok.authuniversity.service.univmail;

import org.springframework.stereotype.Component;

@Component
public class ValidMailLength {
    public boolean checkLength(String mail){
        return mail.length() > 1;
    }
}
