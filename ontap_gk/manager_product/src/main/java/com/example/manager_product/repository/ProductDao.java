package com.example.manager_product.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.manager_product.entity.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
