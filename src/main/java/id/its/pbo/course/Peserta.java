package id.its.pbo.course;

public class Peserta {
	
	private String nama;
	private int usia;
	private String tingkatPendidikan;
	
	public Peserta (String nama,int usia, String tingkatPendidikan ) {
		this.nama = nama;
		this.usia = usia;
		this.tingkatPendidikan = tingkatPendidikan;
	}
	
	public String getNama () {
		return nama;
	}
	
	public void cekKelayakan () throws  UsiaTidakMemenuhiSyaratException, PendidikanTidakMemenuhiSyaratException{
		
		if(usia < 18) {
			throw new UsiaTidakMemenuhiSyaratException();
		}
		if(!tingkatPendidikan.equals("Sarjana") || !tingkatPendidikan.equals("Magister") ){
			throw new PendidikanTidakMemenuhiSyaratException();
		}
	}

}
