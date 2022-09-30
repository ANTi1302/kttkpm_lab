package com.example.flightsdatajpa.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "may_bay")
public class MayBay {

	
	@Id
	private int maMB;
	private String loai;
	private int tamBay;
	
	@OneToMany(mappedBy = "mayBay", fetch = FetchType.EAGER)
	private List<ChungNhan> chungNhans;


	public int getMaMB() {
		return maMB;
	}


	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}


	public String getLoai() {
		return loai;
	}


	public void setLoai(String loai) {
		this.loai = loai;
	}


	public int getTamBay() {
		return tamBay;
	}


	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}


	public List<ChungNhan> getChungNhans() {
		return chungNhans;
	}


	
	public void setChungNhans(List<ChungNhan> chungNhans) {
		this.chungNhans = chungNhans;
	}


	@Override
	public String toString() {
		return "MayBay [maMB=" + maMB + ", loai=" + loai + ", tamBay=" + tamBay + ", chungNhans=" + chungNhans + "]";
	}


	public MayBay() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MayBay(int maMB, String loai, int tamBay, List<ChungNhan> chungNhans) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
		this.chungNhans = chungNhans;
	}
	
	
	
}
