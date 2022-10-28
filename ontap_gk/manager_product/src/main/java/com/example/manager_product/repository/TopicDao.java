package com.example.manager_product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.manager_product.entity.Topic;
//@Repository
//public interface TopicDao extends  JpaRepositoryImplementation<Topic, Integer>{
//	@Query(value = "select * from topic where product_id = :x",nativeQuery = true)
//	 public List<Topic> getTopicByProduct(@Param(value = "x") int x);
//}
