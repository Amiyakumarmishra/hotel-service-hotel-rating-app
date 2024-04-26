package com.amiya.hoteratingapp.hotelService.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(){
		super("Resource Not Found Exception");
	}
	
	public ResourceNotFoundException(String msg){
		super(msg);
	}
	
	
}
