package com.example.flightsdatajpa.entity;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chuyen_bay")
public class ChuyenBay implements Serializable {
	@Id
	private String maCB;
	private String gaDi;
	private String gaDen;
	private long doDai;
	private LocalTime gioDi;
	private LocalTime gioDen;
	private double chiPhi;
	public String getMaCB() {
		return maCB;
	}
	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public long getDoDai() {
		return doDai;
	}
	public void setDoDai(long doDai) {
		this.doDai = doDai;
	}
	public LocalTime getGioDi() {
		return gioDi;
	}
	public void setGioDi(LocalTime gioDi) {
		this.gioDi = gioDi;
	}
	public LocalTime getGioDen() {
		return gioDen;
	}
	public void setGioDen(LocalTime gioDen) {
		this.gioDen = gioDen;
	}
	public double getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(double chiPhi) {
		this.chiPhi = chiPhi;
	}
	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
	public ChuyenBay(String maCB, String gaDi, String gaDen, long doDai, LocalTime gioDi, LocalTime gioDen,
			double chiPhi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}
	public ChuyenBay() {
	}
	
	
}
