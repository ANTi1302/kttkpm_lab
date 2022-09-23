package com.example.demo_jpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.ChuyenBay;

@Repository
public interface ChuyenBayDao extends JpaRepository<ChuyenBay, String> {
//	@Query(value = "select *from chuyenbay where GaDi =:name",nativeQuery = true)
//	public List<ChuyenBay> listChuyenBayDAD();
}
