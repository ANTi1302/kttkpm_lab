package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.service.ChungNhanService;

@RestController
@RequestMapping("/chung-nhan")
public class ChungNhanController {

	@Autowired
	private ChungNhanService chungNhanService;
	
	@GetMapping("/chung-nhan-den-di")
	public List<Object[]> listChuyenBayDenVaDi(){
		return chungNhanService.listChuyenBayDenVaDi();
	}
//	
	@GetMapping("/nv-747")
	public List<Object[]> listNV747(){
		return chungNhanService.listNV747();
	}
//	
	@GetMapping("/may-bay-nguyen={name}")
	public List<Object[]> listMaMBOfNguyen(@PathVariable String name){
		return chungNhanService.listMaMBOfNguyen(name);
	}
//	
	@GetMapping("/loai-may-bay={loai1}&{loai2}")
	public List<Object[]> listMaMVOfLoaiMB(@PathVariable String loai1,@PathVariable String loai2){
		return chungNhanService.listMaMVOfLoaiMB(loai1, loai2);
	}
	@GetMapping("/loai-by-macb={maCB}")
	public List<Object[]> listLoaiByMaCB(@PathVariable String maCB){
		return chungNhanService.listLoaiByMaCB(maCB);
	}
	@GetMapping("/chuyen-bay-by-loai={loai}")
	public List<Object[]> listChuyenBayByLoai(@PathVariable String loai){
		System.out.println(chungNhanService.listChuyenBayByLoai(loai));
		return chungNhanService.listChuyenBayByLoai(loai);
	}
	@GetMapping("/nhan-vien-by-loai={loai}")
	public List<Object[]> listTenNVByLoai(@PathVariable String loai){
		return chungNhanService. listTenNVByLoai(loai);
	}
	@GetMapping("/count-nhan-vien")
	public List<Object[]> listMayBayAndCountNV(){
		return chungNhanService.listMayBayAndCountNV();
	}
	@GetMapping("/list-mamb")
	public List<Object[]> listNVHavingMaMB3(){
		return chungNhanService.listNVHavingMaMB3();
	}
}
