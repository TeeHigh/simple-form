package com.simpleform.advice;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.simpleform.exception.DuplicateLoginException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateLoginException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleDuplicateLoginException(DuplicateLoginException ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "duplicate_login"; // This should match the name of your duplicate.html template
    }
}

