package com.amiya.hoteratingapp.hotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amiya.hoteratingapp.hotelService.entity.HotelEntity;
import com.amiya.hoteratingapp.hotelService.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping
	public ResponseEntity<HotelEntity> createHotel(@RequestBody HotelEntity hotel) {

		return ResponseEntity.ok(hotelService.createHotel(hotel));

	}

	@GetMapping
	public ResponseEntity<List<HotelEntity>> getAllHotel() {

		return ResponseEntity.ok(hotelService.getAllHotels());

	}

	@GetMapping("/{id}")
	public ResponseEntity<HotelEntity> getHotelById(@PathVariable("id") String hotelId) {

		return ResponseEntity.ok(hotelService.getHotelById(hotelId));

	}
}
