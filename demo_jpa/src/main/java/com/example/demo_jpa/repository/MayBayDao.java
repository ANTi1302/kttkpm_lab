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
}
