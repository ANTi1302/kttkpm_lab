package com.example.demo_jpa.service;

import org.springframework.stereotype.Service;

import com.example.demo_jpa.entity.ChuyenBay;

public interface ChuyenBayService {
		ChuyenBay getChuyenBayByID(String maCB);
}
