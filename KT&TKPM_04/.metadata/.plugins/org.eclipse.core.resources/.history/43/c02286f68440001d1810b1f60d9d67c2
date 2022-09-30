package com.example.flightsdatajpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightsdatajpa.entity.MayBay;
import com.example.flightsdatajpa.entity.NhanVien;
import com.example.flightsdatajpa.service.MayBayService;
import com.example.flightsdatajpa.service.NhanVienService;

@RestController
@RequestMapping("/nhan-vien")
public class NhanVienController {
	
	@Autowired
	private NhanVienService nhanVienService;
	
	@Autowired
	private MayBayService mayBayService;

	@GetMapping("/")
	public List<NhanVien> getListNhanVien() {
		List<NhanVien> list = nhanVienService.getAllNhanVien();
		return list;
	}
	
	@GetMapping("/nho-hon={luong}")
	public List<NhanVien> getListNhanVienbyLuong(
			@PathVariable long luong
			) {
		List<NhanVien> list = nhanVienService.getAllNhanVien();
		List<NhanVien> result = new ArrayList<NhanVien>();
		list.forEach(r -> {
			if(r.getLuongNV() < luong)
				result.add(r);
		});
 		return result;
	}
	@GetMapping("/tong-luong")
	public long getTongLuong() {
		List<NhanVien> list = nhanVienService.getAllNhanVien();
		long result = 0;
		for(int i = 0 ; i < list.size() ; i++)
			result += list.get(i).getLuongNV();		
 		return result;
	}
	@GetMapping("/may-bay-boing")
	public List<NhanVien> getAllNhanVienBoing() {
		List<NhanVien> list = nhanVienService.getAllNhanVien();
 		return list;
	}
}
