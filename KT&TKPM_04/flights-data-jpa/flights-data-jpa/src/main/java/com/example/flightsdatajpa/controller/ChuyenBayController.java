package com.example.flightsdatajpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightsdatajpa.entity.ChuyenBay;
import com.example.flightsdatajpa.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyen-bay")
public class ChuyenBayController {

	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/")
	public List<ChuyenBay> findAllChuyenBay() {
		List<ChuyenBay> dsChuyenBay = chuyenBayService.getAllChuyenBay();
		return dsChuyenBay;
	}
	
	@GetMapping("/diem-di-den")
	public List<ChuyenBay> findChuyenBaybyGaDI(
			@RequestParam(defaultValue = "") String gaDen,
			@RequestParam(defaultValue = "") String gaDi
			) {
		List<ChuyenBay> dsChuyenBay = chuyenBayService.getAllChuyenBay();
		if( !gaDen.equals("") || !gaDi.equals("")) {
			List<ChuyenBay> result = new  ArrayList<ChuyenBay>();
			if(( !gaDen.equals("") && !gaDi.equals("")))
				dsChuyenBay.forEach(r -> {
					if(r.getGaDen().equalsIgnoreCase(gaDen) && r.getGaDi().equalsIgnoreCase(gaDi))
						result.add(r);
				});
			else if(!gaDen.equals(""))
				dsChuyenBay.forEach(r -> {
					if(r.getGaDen().equalsIgnoreCase(gaDen))
						result.add(r);
				});
			else
				dsChuyenBay.forEach(r -> {
					if(r.getGaDi().equalsIgnoreCase(gaDi))
						result.add(r);
				});
			return result;
		}
		return dsChuyenBay;
	}
	
	@GetMapping("/do-dai-duong-bay")
	public List<ChuyenBay> findChuyenBaybyDoDaiDuongBay(
			@RequestParam(defaultValue = "0") Integer  minDoDai,
			@RequestParam(defaultValue = "10000000") Integer maxDoDai
			) {
		System.out.println(minDoDai + " : " + maxDoDai);
		List<ChuyenBay> dsChuyenBay = chuyenBayService.getAllChuyenBay();
		List<ChuyenBay> result = new  ArrayList<ChuyenBay>();
		dsChuyenBay.forEach(r -> {
			if(r.getDoDai() > minDoDai && r.getDoDai() < maxDoDai)
				result.add(r);
		});
		return result;
	}
	
	@GetMapping("/so-luong")
	public int getSLChuyenBaybyDiemDiDen(
			@RequestParam(defaultValue = "") String gaDen,
			@RequestParam(defaultValue = "") String gaDi
			) {
		List<ChuyenBay> dsChuyenBay = chuyenBayService.getAllChuyenBay();
		if( !gaDen.equals("") || !gaDi.equals("")) {
			List<ChuyenBay> result = new  ArrayList<ChuyenBay>();
			if(( !gaDen.equals("") && !gaDi.equals("")))
				dsChuyenBay.forEach(r -> {
					if(r.getGaDen().equalsIgnoreCase(gaDen) && r.getGaDi().equalsIgnoreCase(gaDi))
						result.add(r);
				});
			else if(!gaDen.equals(""))
				dsChuyenBay.forEach(r -> {
					if(r.getGaDen().equalsIgnoreCase(gaDen))
						result.add(r);
				});
			else
				dsChuyenBay.forEach(r -> {
					if(r.getGaDi().equalsIgnoreCase(gaDi))
						result.add(r);
				});
			return result.size();
		}
		return 0;	
	}
}
