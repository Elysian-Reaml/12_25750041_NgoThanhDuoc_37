package m37.NgoThanhDuoc_25750041;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class GiaoDich{
	protected String maGiaoDich;
	protected LocalDate ngayGiaoDich;
	protected double donGia;
	protected double dienTich;
	
	//Contructor
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public abstract double thanhTien();
	//Getter and setter
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	@Override
	public String toString() {
		return String.format("Ma: %6s | Ngay: %s | Don gia: %,.0f | DT: %.1f | Thanh tien: %.0f",
				maGiaoDich,ngayGiaoDich.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				donGia,dienTich,thanhTien());
	}
}

