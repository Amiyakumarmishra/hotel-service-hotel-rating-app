package com.amiya.hoteratingapp.hotelService.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amiya.hoteratingapp.hotelService.entity.HotelEntity;
import com.amiya.hoteratingapp.hotelService.exception.ResourceNotFoundException;
import com.amiya.hoteratingapp.hotelService.repository.HotelReposiry;
import com.amiya.hoteratingapp.hotelService.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelReposiry hotelRepo;
	
	@Override
	public HotelEntity createHotel(HotelEntity hotel) {
		// TODO Auto-generated method stub
		String id = UUID.randomUUID().toString();
		hotel.setHotelID(id);
		return hotelRepo.save(hotel);
	}

	@Override
	public HotelEntity getHotelById(String id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with id "+id+" is not present"));
	}

	@Override
	public List<HotelEntity> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

}

