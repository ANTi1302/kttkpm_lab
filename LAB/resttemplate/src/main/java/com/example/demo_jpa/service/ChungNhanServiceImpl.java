package com.example.demo_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.repository.ChungNhanDao;

@Service
public class ChungNhanServiceImpl implements ChungNhanService {
	@Autowired
	private ChungNhanDao chungNhanDao;

	@Override
	public List<Object[]> listChuyenBayDenVaDi() {
		// TODO Auto-generated method stub
		return chungNhanDao.listChuyenBayDenVaDi();
	}

	@Override
	public List<Object[]> listNV747() {
		// TODO Auto-generated method stub
		return chungNhanDao.listNV747();
	}

	@Override
	public List<Object[]> listMaMBOfNguyen(String name) {
		// TODO Auto-generated method stub
		return chungNhanDao.listMaMBOfNguyen(name);
	}

	@Override
	public List<Object[]> listMaMVOfLoaiMB(String loai1, String loai2) {
		// TODO Auto-generated method stub
		return chungNhanDao.listMaMVOfLoaiMB(loai1, loai2);
	}

	@Override
	public List<Object[]> listLoaiByMaCB(String maCB) {
		// TODO Auto-generated method stub
		return chungNhanDao.listLoaiByMaCB(maCB);
	}

	@Override
	public List<Object[]> listChuyenBayByLoai(String loai) {
		// TODO Auto-generated method stub
		return chungNhanDao.listChuyenBayByLoai(loai);
	}

	@Override
	public List<Object[]> listTenNVByLoai(String loai) {
		// TODO Auto-generated method stub
		return chungNhanDao.listTenNVByLoai(loai);
	}

	@Override
	public List<Object[]> listMayBayAndCountNV() {
		// TODO Auto-generated method stub
		return chungNhanDao.listMayBayAndCountNV();
	}

	@Override
	public List<Object[]> listNVHavingMaMB3() {
		// TODO Auto-generated method stub
		return chungNhanDao.listNVHavingMaMB3();
	}

}
