package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.entity.MayBay;
import com.example.demo_jpa.service.MayBayService;

@RestController
@RequestMapping("/may-bay")
public class MayBayController {

	@Autowired
	private MayBayService mayBayService;

	@GetMapping("/tam-bay={ind}")
	public List<MayBay> listTamBay10000(@PathVariable int ind) {
		List<MayBay> ds = mayBayService.listTamBay10000(ind);
		return ds;
	}

	@GetMapping("/loai={loai}")
	public List<MayBay> listLoaiBoeing(@PathVariable String loai) {
		List<MayBay> ds = mayBayService.listLoaiBoeing(loai);
		return ds;
	}

	@GetMapping("/so-luong-boing")
	public int numMayBayBeoing() {
		return mayBayService.numMayBayBeoing();
	}

	@GetMapping("/nhan-vien")
	public List<Object[]> listNVOfMayBay() {
		List<Object[]> ds = mayBayService.listNVOfMayBay();
		return ds;
	};

	@GetMapping("/")
	public List<Object[]> listMaMBMAX3AndTamBay() {
		List<Object[]> ds = mayBayService.listMaMBMAX3AndTamBay();
		return ds;
	};
}
