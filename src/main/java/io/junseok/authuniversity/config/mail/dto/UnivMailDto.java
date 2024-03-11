package io.junseok.authuniversity.config.mail.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnivMailDto {
    private String mailAddress;
    private String title;
    private String message;
}
