package com.example.demo_jpa.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.repository.ChuyenBayDao;

@Service
public class ChuyenBayImpl implements ChuyenBayService{
	@Autowired
	private ChuyenBayDao chuyenBayDao;

	@Override
	public ChuyenBay getChuyenBayByID(String maCB) {
		ChuyenBay chuyenBay = chuyenBayDao.findById(maCB).orElse(null);
		if (Objects.isNull(chuyenBay)) {
            return null;
        }
		return chuyenBay;
	}

}
