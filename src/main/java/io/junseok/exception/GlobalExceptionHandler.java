package io.junseok.exception;

import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(DistanceException.class)
    protected ResponseEntity<ErrorResponseEntity> errorCodeResponseEntity(DistanceException e,
        HttpServletRequest request) {
        log.error("UnhandledException: {} {}    errMessage = {}\n",
            request.getMethod(),
            request.getRequestURI(),
            e.getErrorCode().getMessage()
        );
        return ErrorResponseEntity.responseEntity(e.getErrorCode());
    }



    @ExceptionHandler(ChatRoomException.class)
    protected ResponseEntity<ErrorResponseEntity> errorCodeResponseEntity1(ChatRoomException e,
        HttpServletRequest request) {
        log.error("UnhandledException: {} {}    errMessage = {}\n",
            request.getMethod(),
            request.getRequestURI(),
            e.getErrorCode().getMessage()
        );
        return ErrorResponseEntity.responseEntity(e.getErrorCode());
    }
}
