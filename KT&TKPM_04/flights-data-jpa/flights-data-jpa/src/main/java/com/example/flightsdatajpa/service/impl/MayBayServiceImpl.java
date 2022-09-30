package com.example.flightsdatajpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightsdatajpa.entity.MayBay;
import com.example.flightsdatajpa.jpaRepository.MayBayRepository;
import com.example.flightsdatajpa.service.MayBayService;

@Service
public class MayBayServiceImpl implements MayBayService {
	
	@Autowired
	private MayBayRepository mayBayRepository;
	

	@Override
	public List<MayBay> getAlMayBay() {
		// TODO Auto-generated method stub
		return mayBayRepository.findAll();
	}

}
