package com.example.demo_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.repository.NhanVienDao;
@Service
public class NhanVienServiceImpl implements NhanVienService{

	@Autowired
	private NhanVienDao nhanVienDao;
	@Override
	public int sumLuongNV() {
		// TODO Auto-generated method stub
		return nhanVienDao.sumLuongNV();
	}

	@Override
	public List<Object[]> listLuongMax() {
		// TODO Auto-generated method stub
		return nhanVienDao.listLuongMax();
	}

	@Override
	public List<Object[]> listNotPhiCong() {
		// TODO Auto-generated method stub
		return nhanVienDao.listNotPhiCong();
	}

}
