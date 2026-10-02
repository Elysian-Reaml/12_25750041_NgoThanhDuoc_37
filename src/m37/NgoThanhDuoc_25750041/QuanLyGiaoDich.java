package m37.NgoThanhDuoc_25750041;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoDich{
	public static void main(String[] args) {
		List<GiaoDich> danhSach= new ArrayList<>();
		danhSach.add(new GiaoDichDat("GDD01", LocalDate.of(2013, 9, 15), 10_000_000, 100, "A"));
		danhSach.add(new GiaoDichDat("GDD02", LocalDate.of(2013, 10, 20), 8_000_000, 200, "B"));
		danhSach.add(new GiaoDichDat("GDD03", LocalDate.of(2014, 1, 10), 12_000_000, 150, "C"));
		
		danhSach.add(new GiaoDichNha("GDN01", LocalDate.of(2013, 12, 15), 10_000_000, 80, "cao cap", "Quan 1"));
		danhSach.add(new GiaoDichNha("GDN02", LocalDate.of(2013, 11, 20), 8_000_000, 120, "thuong", "Quan 2"));
		danhSach.add(new GiaoDichNha("GDN03", LocalDate.of(2014, 2, 10), 12_000_000, 150, "cao cap", "Quan 3"));
		
		int soLuongDat=0, soLuongNha=0;
		for(GiaoDich gd: danhSach) {
			if(gd instanceof GiaoDichDat) {
				soLuongDat++;
			}
			else if (gd instanceof GiaoDichNha) {
				soLuongNha++;
			}
		}
		System.out.println("So giao dich dat"+soLuongDat);
		System.out.println("So giao dich nha"+soLuongNha);
		double tongTienDat=0;
		for(GiaoDich gd: danhSach) {
			if(gd instanceof GiaoDichDat) {
				tongTienDat=gd.thanhTien();
			}
		}
		double trungBinh=(soLuongDat>0)? tongTienDat/soLuongDat:0;
		System.out.println(trungBinh);
		
		System.out.println("\n=== Giao dich thang 9/2013 ===");
		for(GiaoDich gd : danhSach) {
			if(gd.getNgayGiaoDich().getMonthValue()==9
					&& gd.getNgayGiaoDich().getYear()==2013) {
				System.out.println(gd);
			}
		}
	}
}