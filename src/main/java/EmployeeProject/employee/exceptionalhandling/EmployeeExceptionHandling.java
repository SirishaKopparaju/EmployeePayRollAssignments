package EmployeeProject.employee.exceptionalhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import EmployeeProject.employee.dto.ResponseDTO;

@ControllerAdvice
public class EmployeeExceptionHandling {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handleMethodArugmentNotValidException(
			MethodArgumentNotValidException exception){
				
				ResponseDTO responseDTO = new ResponseDTO("Exception while processing your Rest Request", exception.getMessage());
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);

	}

}
