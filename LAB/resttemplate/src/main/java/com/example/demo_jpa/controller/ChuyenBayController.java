package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyen-bay")
public class ChuyenBayController {

	@Autowired
	private ChuyenBayService chuyenBayService;
	@GetMapping("/chuyen-bay-dad={name}")
	public List<ChuyenBay> listChuyenBayDAD(@PathVariable String name){
		return chuyenBayService.listChuyenBayDAD(name);
	}
	@GetMapping("/chuyen-bay-10-8")
	public List<ChuyenBay> listChuyenBay10To8(){
		return chuyenBayService.listChuyenBay10To8();
	}
	@GetMapping("/chuyen-bay-den-di={di}&{den}")
	public List<ChuyenBay> listChuyenBayDenVaDi(@PathVariable String di,@PathVariable String den){
		return chuyenBayService.listChuyenBayDenVaDi(di, den);
	}
	@GetMapping("/num-chuyen-bay")
	public int numChuyenBaySGN() {
		return chuyenBayService.numChuyenBaySGN();
	}
	@GetMapping("/chuyen-bay-aba")
	public List<ChuyenBay> listABA(){
		return chuyenBayService.listABA();
	}
	@GetMapping("/group-ga-di")
	public List<Object[]> listGroupGaDi(){
		return chuyenBayService.listGroupGaDi();
	}
	@GetMapping("/1200")
	public List<ChuyenBay> list1200(){
		return chuyenBayService.list1200();
	}
	@GetMapping("/1200-gadi")
	public List<Object[]> list1200GroupGaDi(){
		return chuyenBayService.list1200GroupGaDi();
	}
	@GetMapping("/max-boeing={loai}")
	public List<Object[]> listMaxTamBayOfBoeing(@PathVariable String loai){
		return chuyenBayService.listMaxTamBayOfBoeing(loai);
	}
	@GetMapping("/sum-chi-phi")
	public List<Object[]> listSumChiPhi(){
		return chuyenBayService.listSumChiPhi();
	}
	
}
