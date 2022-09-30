package com.example.flightsdatajpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@IdClass(ChungNhan_PK.class)
@Table(name = "chung_nhan")
public class ChungNhan implements Serializable{

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maMB")
	private MayBay mayBay ;

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maNV")
	private NhanVien nhanVien;
	
	
	
	public MayBay getMayBay() {
		return mayBay;
	}



	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}



	public NhanVien getNhanVien() {
		return nhanVien;
	}


	public ChungNhan(MayBay mayBay, NhanVien nhanVien) {
		super();
		this.mayBay = mayBay;
		this.nhanVien = nhanVien;
	}


	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}



	public ChungNhan() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "ChungNhan [mayBay=" + mayBay.getMaMB() + ", nhanVien=" + nhanVien.getMaNV() + "]";
	}
	
}
