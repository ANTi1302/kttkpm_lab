package com.example.demo_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.MayBay;
@Repository
public interface MayBayDao extends CrudRepository<MayBay, Integer>{
	@Query(value = "select *from maybay where TamBay> :index",nativeQuery = true)
	public List<MayBay> listTamBay10000(@Param(value = "index")int index);
//	select *from maybay where Loai like'%Boeing%'
	@Query(value = "select *from maybay where Loai like %:loai%",nativeQuery = true)
	public List<MayBay> listLoaiBoeing(@Param(value = "loai")String loai);
//	select count(*)from maybay where Loai like '%Boeing%'
	@Query(value = "select count(*)from maybay where Loai like '%Boeing%'",nativeQuery = true)
	public int numMayBayBeoing();
//	SELECT nhanvien.MaNV,count(chungnhan.MaMB)
//	FROM     chungnhan INNER JOIN
//	                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV
//	GROUP BY nhanvien.MaNV
	@Query(value = "SELECT nhanvien.MaNV,count(chungnhan.MaMB)\r\n"
			+ "FROM     chungnhan INNER JOIN\r\n"
			+ "                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "GROUP BY nhanvien.MaNV",nativeQuery = true)
	public List<Object[]> listNVOfMayBay();

}
