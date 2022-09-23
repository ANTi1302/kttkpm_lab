package com.example.demo_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.ChungNhan;
import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.entity.NhanVien;
@Repository
public interface ChungNhanDao extends CrudRepository<ChungNhan, String>{
//	SELECT nhanvien.MaNV, nhanvien.Ten, nhanvien.Luong
//	FROM     chungnhan INNER JOIN
//	                  maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
//	                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV
//					  where maybay.Loai like '%Boeing%'
//	GROUP BY nhanvien.MaNV, nhanvien.Ten, nhanvien.Luong
	@Query(value = "SELECT nhanvien.MaNV\r\n"
			+ "FROM     chungnhan INNER JOIN\r\n"
			+ "                  maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "				  where maybay.Loai like '%Boeing%'\r\n"
			+ "GROUP BY nhanvien.MaNV",nativeQuery = true)
	public List<Object[]> listChuyenBayDenVaDi();
//	select * FROM     chungnhan INNER JOIN
//    nhanvien ON chungnhan.MaNV = nhanvien.MaNV where MaMB=747
	@Query(value = "select nhanvien.MaNV,MaMB,Ten,Luong FROM     chungnhan INNER JOIN\r\n"
			+ "                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV where MaMB=747",nativeQuery = true)
	public List<Object[]> listNV747();
//	select MaMB FROM     chungnhan INNER JOIN
//    nhanvien ON chungnhan.MaNV = nhanvien.MaNV where nhanvien.Ten like '%Nguyen%'
	@Query(value = "select MaMB FROM     chungnhan INNER JOIN\r\n"
			+ "                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV where nhanvien.Ten like %:ten%",nativeQuery = true)
	public List<Object[]> listMaMBOfNguyen(@Param(value = "ten")String name);
//	SELECT nhanvien.MaNV
//	FROM     chungnhan INNER JOIN
//	                  maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
//	                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV
//					  where maybay.Loai like '%Boeing%' or maybay.Loai like '%Airbus%'
//	GROUP BY nhanvien.MaNV
	@Query(value = "SELECT nhanvien.MaNV\r\n"
			+ "FROM     chungnhan INNER JOIN\r\n"
			+ "                  maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "				  where maybay.Loai like %:loai1% or maybay.Loai like %:loai2%\r\n"
			+ "GROUP BY nhanvien.MaNV",nativeQuery = true)
	public List<Object[]> listMaMVOfLoaiMB(@Param(value = "loai1")String loai1,@Param(value = "loai2")String loai2);
}
