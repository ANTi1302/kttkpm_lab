package com.example.demo_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.NhanVien;
@Repository
public interface NhanVienDao extends CrudRepository<NhanVien, String>{
//	select sum(Luong) from nhanvien
	@Query(value = "select sum(Luong) from nhanvien",nativeQuery = true)
	public int sumLuongNV();
//	select top 1 MaNV,MAX(Luong) from nhanvien group by MaNV
	@Query(value = "select top 1 MaNV,MAX(Luong) from nhanvien group by MaNV",nativeQuery = true)
	public List<Object[]> listLuongMax();
//	select * from nhanvien full outer join chungnhan on nhanvien.MaNV=chungnhan.MaNV
//			where chungnhan.MaNV is null
	@Query(value = "select nhanvien.MaNV,Ten,Luong from nhanvien full outer join chungnhan on nhanvien.MaNV=chungnhan.MaNV\r\n"
			+ "where chungnhan.MaNV is null",nativeQuery = true)
	public List<Object[]> listNotPhiCong();
}
