package com.amiya.hoteratingapp.hotelService.service;

import java.util.List;

import com.amiya.hoteratingapp.hotelService.entity.HotelEntity;

public interface HotelService {
	
	HotelEntity createHotel(HotelEntity hotel);
	
	HotelEntity getHotelById(String id);
	
	List<HotelEntity> getAllHotels();
}
