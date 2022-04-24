package nl.novi.backendspringboottechiteasy.controllers;

import nl.novi.backendspringboottechiteasy.exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> exception(RecordNotFoundException exception)
    {
        return new ResponseEntity<>(exception.getMessage(),
                HttpStatus.NOT_FOUND);
    }
}
