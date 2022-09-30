package com.example.demo_jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChungNhanService {
	public List<Object[]> listChuyenBayDenVaDi();
	
	public List<Object[]> listNV747();
	
	public List<Object[]> listMaMBOfNguyen(String name);
	
	public List<Object[]> listMaMVOfLoaiMB(String loai1,String loai2);
	public List<Object[]> listLoaiByMaCB(String maCB);
	public List<Object[]> listChuyenBayByLoai(String loai);
	public List<Object[]> listTenNVByLoai(String loai);
	public List<Object[]> listMayBayAndCountNV();
	public List<Object[]> listNVHavingMaMB3();
}
