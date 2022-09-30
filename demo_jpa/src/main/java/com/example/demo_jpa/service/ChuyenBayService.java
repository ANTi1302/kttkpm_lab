package com.example.demo_jpa.service;

import java.util.List;


import com.example.demo_jpa.entity.ChuyenBay;

public interface ChuyenBayService {
	public List<ChuyenBay> listChuyenBayDAD(String name);
	public List<ChuyenBay> listChuyenBay10To8();
	public List<ChuyenBay> listChuyenBayDenVaDi(String di,String den);
	public int numChuyenBaySGN();
	public List<ChuyenBay> listABA();
	public List<Object[]> listGroupGaDi();
	public List<ChuyenBay> list1200();
	public List<Object[]> list1200GroupGaDi();
	public List<Object[]> listMaxTamBayOfBoeing(String loai);
	public List<Object[]> listSumChiPhi();
}
