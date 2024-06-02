package io.junseok.authuniversity.controller;

import io.junseok.authuniversity.dto.CheckEmailDto;
import io.junseok.authuniversity.dto.SchoolNameDto;
import io.junseok.authuniversity.service.univmail.SendSchoolDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/univ")
@CrossOrigin
public class MailController {
    private final SendSchoolDomain sendSchoolDomain;

    /** NOTE
     * 학교 이름 선택시 해당 도메인 값 return
     */
    @GetMapping("check/univ-domain")
    public ResponseEntity<String> checkDomain(@RequestBody SchoolNameDto schoolNameDto){
        return ResponseEntity.ok(sendSchoolDomain.sendDomain(schoolNameDto.schoolName()));
    }

    /** NOTE
     * 존재하는 이메일인지 중복 확인
     */

}
