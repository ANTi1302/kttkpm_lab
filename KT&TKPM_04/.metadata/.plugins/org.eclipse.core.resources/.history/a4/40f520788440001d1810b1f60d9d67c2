package com.example.flightsdatajpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="nhan_vien")
public class NhanVien implements Serializable {

	@Id
	private String maNV;
	private String tenNV;
	private int luongNV;
	@OneToMany(mappedBy = "nhanVien", fetch = FetchType.EAGER)
	List<ChungNhan> chungNhans;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getLuongNV() {
		return luongNV;
	}
	public void setLuongNV(int luongNV) {
		this.luongNV = luongNV;
	}
	public NhanVien(String maNV, String tenNV, int luongNV) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.luongNV = luongNV;
	}
	
	public NhanVien(String maNV, String tenNV, int luongNV, List<ChungNhan> chungNhans) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.luongNV = luongNV;
		this.chungNhans = chungNhans;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", luongNV=" + luongNV + ", chungNhans=" + chungNhans
				+ "]";
	}
	
	
}
