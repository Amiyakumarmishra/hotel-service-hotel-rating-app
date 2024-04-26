package com.amiya.hoteratingapp.hotelService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@GetMapping
	public ResponseEntity<List<String>> getListOfStaffs(){
		
		
		List<String> staffs = Arrays.asList("Staff1","Staff2","Staff3");
		
		return ResponseEntity.ok(staffs);
	}

}
