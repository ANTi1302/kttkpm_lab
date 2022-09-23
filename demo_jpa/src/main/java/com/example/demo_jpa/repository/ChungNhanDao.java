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
}
