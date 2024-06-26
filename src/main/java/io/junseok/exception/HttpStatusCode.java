package io.junseok.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HttpStatusCode {
    CREATED(201),
    OK(200),
    CONFLICT(409),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    CONTAIN_BADWORD(451),
    NOT_FOUND_MESSAGE(406),
    LENGTH_REQUIRED(411),
    UNSUPPORTED_MEDIA_TYPE(415);

    private final int status;
}
