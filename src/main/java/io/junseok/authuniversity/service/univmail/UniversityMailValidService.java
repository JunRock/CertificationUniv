package io.junseok.authuniversity.service.univmail;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UniversityMailValidService {
    private final ValidMailLength validMailLength;
    private final ValidSpecialWord validSpecialWord;
    public boolean checkMail(String email){
        if(!validMailLength.checkLength(email))
            throw new IllegalStateException("이메일 길이가 너무 짧습니다!");
        if(validSpecialWord.checkContainSpecialWord(email))
            throw new IllegalStateException("특수문자는 포함할 수 없습니다!");
        return true;
    }
}
