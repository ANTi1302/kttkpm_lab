package com.example.demo_jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.MayBay;
@Repository
public interface MayBayDao extends CrudRepository<MayBay, Integer>{

}
