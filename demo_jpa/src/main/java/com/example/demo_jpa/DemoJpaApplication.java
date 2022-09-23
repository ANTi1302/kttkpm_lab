package com.example.demo_jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.repository.ChungNhanDao;
import com.example.demo_jpa.repository.ChuyenBayDao;
import com.example.demo_jpa.repository.MayBayDao;
import com.example.demo_jpa.repository.NhanVienDao;

@SpringBootApplication
@org.springframework.transaction.annotation.Transactional
public class DemoJpaApplication {
	@Bean
	public CommandLineRunner run(ChuyenBayDao chuyenBayDao,MayBayDao mayBayDao,NhanVienDao nhanVienDao,ChungNhanDao chungNhanDao) {
		return(ArgsAnnotationPointcut ->{
			//      demo hoy thầy
			System.out.println((chuyenBayDao.findAll()));
			//1.	Cho biết các chuyến bay đi Đà Lạt (DAD).
			System.out.println((chuyenBayDao.listChuyenBayDAD("DAD")));
			// 2.	Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
			System.out.println((mayBayDao.listTamBay10000(10000)));
			// 3.   Tìm các nhân viên có lương nhỏ hơn 10,000
			System.out.println((mayBayDao.listLoaiBoeing("Boeing")));
			// 4.	Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
			System.out.println((chuyenBayDao.listChuyenBay10To8()));
//			5.	Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
			System.out.println((chuyenBayDao.listChuyenBayDenVaDi("SGN", "BMV")));
//			6.	Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
			System.out.println(("Number of SGN: "+chuyenBayDao.numChuyenBaySGN()));
//			7.	Có bao nhiêu loại máy báy Boeing.
			System.out.println(("Number of Beoing: "+mayBayDao.numMayBayBeoing()));
//			8.	Cho biết tổng số lương phải trả cho các nhân viên.
			System.out.println(("Sum of Luong cua NV: "+nhanVienDao.sumLuongNV()));
//			9.	Cho biết mã số của các phi công lái máy báy Boeing.
			List<Object[]> pr_list = new ArrayList<Object[]>();
			pr_list.addAll(chungNhanDao.listChuyenBayDenVaDi());
			for (Object[] objects : pr_list) {
				System.out.println("Ma nhan vien la: "+objects[0]);
			}
//			10.	Cho biết các nhân viên có thể lái máy bay có mã số 747.
			for (Object[] objects : chungNhanDao.listNV747()) {
				System.out.println("Ma nhan vien la: "+objects[0]+", MaMB: "+objects[1]+", Ten: "+objects[2]+", Luong: "+objects[3]);
			}
//			11.	Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
			for (Object[] objects : chungNhanDao.listMaMBOfNguyen("Nguyen")) {
				System.out.println("Ma may bay la: "+objects[0]);
			}
//			12.	Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
			for (Object[] objects : chungNhanDao.listMaMVOfLoaiMB("Boeing","Airbus")) {
				System.out.println("Ma nhan vien la: "+objects[0]);
			}
//			13.	Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.
			for (Object[] objects : chungNhanDao.listLoaiByMaCB("VN280")) {
				System.out.println("Loai may bay : "+objects[0]);
			}
//			14.	Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.
			for (Object[] objects : chungNhanDao.listChuyenBayByLoai("Airbus A320")) {
				System.out.println("MaCB: "+objects[0]+", GaDi: "+objects[1]+", GaDen: "+objects[2]+", DoDai: "+objects[3]+", GioDi: "+objects[4]+", GioDen: "+objects[5]+", ChiPhi: "+objects[6]);
			}
//			15.	Cho biết tên của các phi công lái máy bay Boeing.
			for (Object[] objects : chungNhanDao.listTenNVByLoai("Boeing")) {
				System.out.println("Ten nhan vien : "+objects[0]);
			}
//			16.	Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
//			17.	Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này.
//
//			18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.
//			19.	Với mỗi ga có chuyến  bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó.
//			20.	Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00
//			21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
//			22.	Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
//			23.	Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
//			24.	Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
//			25.	Tìm các nhân viên không phải là phi công.
//			26.	Cho biết mã số của các nhân viên có lương cao nhất.
//			27.	Cho biết tổng số lương phải trả cho các phi công.
//			28.	Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing.
//

		});
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
	}
	
	
}
