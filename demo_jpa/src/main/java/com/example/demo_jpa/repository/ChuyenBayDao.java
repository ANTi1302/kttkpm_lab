package com.example.demo_jpa.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.ChuyenBay;

@Repository
public interface ChuyenBayDao extends JpaRepository<ChuyenBay, String> {
	@Query(value = "select *from chuyenbay where GaDi =:name",nativeQuery = true)
	public List<ChuyenBay> listChuyenBayDAD(@Param(value = "name")String name);
	@Query(value = "select *from chuyenbay where DoDai < 10000 and  DoDai > 8000",nativeQuery = true)
	public List<ChuyenBay> listChuyenBay10To8();
//	select *from chuyenbay where GaDi like 'SGN' and GaDen like 'BMV'
	@Query(value = "select *from chuyenbay where GaDi like :di and GaDen like :den",nativeQuery = true)
	public List<ChuyenBay> listChuyenBayDenVaDi(@Param(value = "di")String di,@Param(value = "den")String den);
//	select count(*)from chuyenbay where GaDi like 'SGN'
	@Query(value = "select count(*)from chuyenbay where GaDi like 'SGN'",nativeQuery = true)
	public int numChuyenBaySGN();
}
