package com.example.demo_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.entity.MayBay;
import com.example.demo_jpa.repository.MayBayDao;

@Service
public class MayBayServiceImpl implements MayBayService{
	
	
	@Autowired
	private MayBayDao mayBayDao;
	
	
	@Override
	public List<MayBay> listTamBay10000(int ind) {
		// TODO Auto-generated method stub
		return mayBayDao.listTamBay10000(ind);
	}


	@Override
	public List<MayBay> listLoaiBoeing(String loai) {
		// TODO Auto-generated method stub
		return mayBayDao.listLoaiBoeing(loai);
	}


	@Override
	public int numMayBayBeoing() {
		// TODO Auto-generated method stub
		return mayBayDao.numMayBayBeoing();
	}


	@Override
	public List<Object[]> listNVOfMayBay() {
		// TODO Auto-generated method stub
		return mayBayDao.listNVOfMayBay();
	}


	@Override
	public List<Object[]> listMaMBMAX3AndTamBay() {
		// TODO Auto-generated method stub
		return mayBayDao.listMaMBMAX3AndTamBay();
	}

	
	
}
