package com.example.flightsdatajpa.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightsdatajpa.entity.ChungNhan;
import com.example.flightsdatajpa.entity.MayBay;

public interface ChungNhanRepository extends JpaRepository<ChungNhan, Integer> {

}
