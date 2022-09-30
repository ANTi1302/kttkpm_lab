package com.example.flightsdatajpa.service;

import java.util.List;

import com.example.flightsdatajpa.entity.ChuyenBay;

public interface ChuyenBayService {
	List<ChuyenBay> getAllChuyenBay();
	List<ChuyenBay> getAllChuyenBayByGaDen(String gaDen);
	ChuyenBay getChuyenBay(String maCB);
}
