package com.amiya.hoteratingapp.hotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amiya.hoteratingapp.hotelService.entity.HotelEntity;

@Repository
public interface HotelReposiry extends JpaRepository<HotelEntity,String>{

}
