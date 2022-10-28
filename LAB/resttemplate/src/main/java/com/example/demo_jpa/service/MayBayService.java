package com.example.demo_jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo_jpa.entity.MayBay;

public interface MayBayService {
	public List<MayBay> listTamBay10000(int ind);
	public List<MayBay> listLoaiBoeing(String loai);
	public int numMayBayBeoing();
	public List<Object[]> listNVOfMayBay();
	public List<Object[]> listMaMBMAX3AndTamBay();
}
