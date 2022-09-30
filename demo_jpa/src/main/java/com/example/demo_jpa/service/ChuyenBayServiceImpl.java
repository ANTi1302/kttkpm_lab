package com.example.demo_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.repository.ChuyenBayDao;
@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{

	@Autowired
	private ChuyenBayDao chuyenBayDao;
	@Override
	public List<ChuyenBay> listChuyenBayDAD(String name) {
		// TODO Auto-generated method stub
		return chuyenBayDao.listChuyenBayDAD(name);
	}

	@Override
	public List<ChuyenBay> listChuyenBay10To8() {
		// TODO Auto-generated method stub
		return chuyenBayDao.listChuyenBay10To8();
	}

	@Override
	public List<ChuyenBay> listChuyenBayDenVaDi(String di, String den) {
		// TODO Auto-generated method stub
		return chuyenBayDao.listChuyenBayDenVaDi(di, den);
	}

	@Override
	public int numChuyenBaySGN() {
		// TODO Auto-generated method stub
		return chuyenBayDao.numChuyenBaySGN();
	}

	@Override
	public List<ChuyenBay> listABA() {
		// TODO Auto-generated method stub
		return chuyenBayDao.listABA();
	}

	@Override
	public List<Object[]> listGroupGaDi() {
		// TODO Auto-generated method stub
		return chuyenBayDao.listGroupGaDi();
	}

	@Override
	public List<ChuyenBay> list1200() {
		// TODO Auto-generated method stub
		return chuyenBayDao.list1200();
	}

	@Override
	public List<Object[]> list1200GroupGaDi() {
		// TODO Auto-generated method stub
		return chuyenBayDao.list1200GroupGaDi();
	}

	@Override
	public List<Object[]> listMaxTamBayOfBoeing(String loai) {
		// TODO Auto-generated method stub
		return chuyenBayDao.listMaxTamBayOfBoeing(loai);
	}

	@Override
	public List<Object[]> listSumChiPhi() {
		// TODO Auto-generated method stub
		return chuyenBayDao.listSumChiPhi();
	}

}
