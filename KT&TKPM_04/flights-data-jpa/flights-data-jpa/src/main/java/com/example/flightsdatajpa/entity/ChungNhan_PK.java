package com.example.flightsdatajpa.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChungNhan_PK implements Serializable {
	private String nhanVien;
	private int mayBay;
	
	public ChungNhan_PK() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(mayBay, nhanVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChungNhan_PK other = (ChungNhan_PK) obj;
		return mayBay == other.mayBay && Objects.equals(nhanVien, other.nhanVien);
	}
	
	
}
