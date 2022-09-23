package com.example.demo_jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.NhanVien;
@Repository
public interface NhanVienDao extends CrudRepository<NhanVien, String>{

}
