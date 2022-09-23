package com.example.demo_jpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay implements Serializable{

	@Id
    @GeneratedValue
	private int MaMB;
	@Column(columnDefinition = "varchar(50)")
	private String Loai;
	@Column()
	private int TamBay;
	@OneToMany(mappedBy = "MaMB")
	private List<ChungNhan> chungNhan;
	public int getMaMB() {
		return MaMB;
	}
	public void setMaMB(int maMB) {
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
	public MayBay(int maMB, String loai, int tamBay) {
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
