package EmployeeProject.employee.exceptionalhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import EmployeeProject.employee.dto.ResponseDTO;


@ControllerAdvice
public class CustomExceptionHandler {
	@ExceptionHandler(ExceptionHandling.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(ExceptionHandling exception) {
        ResponseDTO responseDTO = new ResponseDTO("Exception while parsing Rest request", exception.getMessage());
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
