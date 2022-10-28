package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.repository.NhanVienDao;
import com.example.demo_jpa.service.NhanVienService;

@RestController
@RequestMapping("/nhan-vien")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;
	@GetMapping("/sum-nhan-vien")
	public int sumLuongNV() {
		return nhanVienService.sumLuongNV();
	}
	@GetMapping("/max-luong-nhan-vien")
	public List<Object[]> listLuongMax(){
		return nhanVienService.listLuongMax();
	}
	@GetMapping("/not-phi-cong")
	public List<Object[]> listNotPhiCong(){
		return nhanVienService.listNotPhiCong();
	}

}
