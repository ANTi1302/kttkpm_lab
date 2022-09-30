package com.example.flightsdatajpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightsdatajpa.entity.ChuyenBay;
import com.example.flightsdatajpa.jpaRepository.ChuyenBayRepository;
import com.example.flightsdatajpa.service.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Override
	public List<ChuyenBay> getAllChuyenBay() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAll();
	}

	@Override
	public ChuyenBay getChuyenBay(String maCB) {
		// TODO Auto-generated method stub
		Optional<ChuyenBay> result = chuyenBayRepository.findById(maCB);
		if(result.isPresent())	
			return result.get();
		else
			throw new  RuntimeException("khong tim thay employee co id= " + maCB);
	}

	@Override
	public List<ChuyenBay> getAllChuyenBayByGaDen(String gaDen) {
		// TODO Auto-generated method stub
//		Optional<ChuyenBay> result = chuyenBayRepositor
		
		return null;
	}
	
	
}
