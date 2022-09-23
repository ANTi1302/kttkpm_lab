package com.example.demo_jpa.service;

import java.util.List;
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
	public List<ChuyenBay> listChuyenBayDAD() {
		List<ChuyenBay> chuyenBays = chuyenBayDao.listChuyenBayDAD("DAD");
		
		return chuyenBays;
	}

}
