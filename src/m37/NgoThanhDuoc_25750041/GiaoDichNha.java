package m37.NgoThanhDuoc_25750041;

import java.time.LocalDate;

class GiaoDichNha extends GiaoDich{
	private String loaiNha;
	private String diaChi;
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	@Override
	public double thanhTien() {
		if (loaiNha.equalsIgnoreCase("Cao cap")) {
			return dienTich* donGia;
		}
		return dienTich*donGia*0.9;
	}
	@Override
	public String toString() {
		return "[NHA] "+super.toString()+"| Loai: " +loaiNha +" | DC: "+ diaChi;
	}

}
