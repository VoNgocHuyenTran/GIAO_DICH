package huyenTran;

import java.time.LocalDate;

public abstract class GiaoDich {
	public abstract double getThanhTien();
	protected String maGD;
	protected LocalDate ngayGD;
	protected double dientich;
	protected double donGia;
	// dong goi
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String ma) throws IllegalAccessException {
		if (ma!= null) {
			this.maGD = ma;
		} else {
			throw new IllegalAccessException(" Loi ma");

		}
		
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDientich() {
		return dientich;
	}
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	} 
	// ham tao
	public GiaoDich() throws IllegalAccessException {
		this(" ",LocalDate.now(),0,0);
	}
	public GiaoDich(String ma, LocalDate ngayGD, double dientich, double donGia) throws IllegalAccessException {
		
		if (ma!= null) {
			this.maGD = ma;
		} else {
			throw new IllegalAccessException(" Loi ma");

		}
		this.ngayGD = ngayGD;
		this.dientich = dientich;
		this.donGia = donGia;
	}
	//toString
	@Override
	public String toString() {
		String s ="";
		s+= s.format("|10%s|10%s|10%s|10%s|", getMaGD(), getNgayGD(), getDientich(), getDonGia());
		
		return s;
	}
	
	

}
