package com.amiya.hoteratingapp.hotelService.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,Object>> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		Map<String,Object> ret = new HashMap<>();
		ret.put("Status", HttpStatus.NOT_FOUND);
		ret.put("Message", ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ret);
	}
}
