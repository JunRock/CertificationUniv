package io.junseok.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DistanceException extends RuntimeException{
    ErrorCode errorCode;
}
