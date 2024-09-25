package huyenTran;

import java.util.ArrayList;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public ListGD() {
		
		ls = new ArrayList<GiaoDich>(2);
		
	}
	//them
	public boolean themGD(GiaoDich g) {
		if (!ls.contains(g)) {
			
			return false;
			
		} else {
			
			return ls.add(g);
			

		}

	}
	//xuat giao dich
	
	List<GiaoDich> getAll(){
		return ls;
		
	}
	// tim giao dich
	public GiaoDich tim(String ma) {
		for(GiaoDich giaoDich : ls ) {
			if(giaoDich.getMaGD().equalsIgnoreCase(ma))
			return giaoDich;
		}
		return null;
		
	}
	// xoa 
	public boolean xoaGD(GiaoDich g) {
		if(tim(g.maGD)!=null)
			ls.remove(g);
		return false;
	}
	

}
