package io.junseok.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChatRoomException extends RuntimeException{
    ErrorCode errorCode;
}
