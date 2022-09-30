package com.example.flightsdatajpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightsdatajpa.entity.NhanVien;
import com.example.flightsdatajpa.jpaRepository.NhanVienRepository;
import com.example.flightsdatajpa.service.NhanVienService;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	
	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Override
	public List<NhanVien> getAllNhanVien() {
		List<NhanVien> result = nhanVienRepository.findAll();
		return result;
	}

}
