package huyenTran;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich{
	private String loaiDat;
	
public String getLoaiDat() {
		return loaiDat;
	}


	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}


// ham tao
	

	
	@Override
	public double getThanhTien() {
		if (getLoaiDat()=="A") {
			return getDientich()*getDonGia()*1.5;
			
		} else {
			return getDientich()*getDonGia();

		}
		
	}
	public GiaoDichDat(String loaiDat) throws IllegalAccessException {
		super();
		
	}


	public GiaoDichDat(String ma, LocalDate ngayGD, double dientich, double donGia, String loaiDat)
			throws IllegalAccessException {
		super(ma, ngayGD, dientich, donGia);
		this.loaiDat = loaiDat;
	}
	@Override
	public String toString() {
		String s="";
		s+= s.format("%10s|%10s|", getLoaiDat(), getThanhTien());
		return super.toString()+s;
	}


	
	

}
