package com.mydoctor.appointments.advice;

import com.mydoctor.appointments.model.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by emrah.bektas on 20/05/16.
 */
@ControllerAdvice
@ResponseBody
public class MyDoctorControllerAdvice {

    @ExceptionHandler(Exception.class)
    ErrorResponse handle(final Exception exception){
       return ErrorResponse.builder().code(HttpStatus.INTERNAL_SERVER_ERROR.value())
               .message(exception.getMessage()).build();
    }
}
