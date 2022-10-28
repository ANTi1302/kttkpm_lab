package com.example.springbootcrud.entity;

import java.util.List;

public class MayBay{

	private Integer MaMB;
	private String Loai;
	private int TamBay;
	public Integer getMaMB() {
		return MaMB;
	}
	public void setMaMB(Integer maMB) {
		MaMB = maMB;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	public int getTamBay() {
		return TamBay;
	}
	public void setTamBay(int tamBay) {
		TamBay = tamBay;
	}
	public MayBay(Integer maMB, String loai, int tamBay) {
		super();
		MaMB = maMB;
		Loai = loai;
		TamBay = tamBay;
	}
	public MayBay() {
		super();
	}
	@Override
	public String toString() {
		return "MayBay [MaMB=" + MaMB + ", Loai=" + Loai + ", TamBay=" + TamBay + "]";
	}
	
	
}
