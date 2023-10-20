package id.its.pbo.medical;

public class Pasien {
	
	private String nama;
	private int umur;
	private String alamat;
	
	
	public Pasien(String nama,int umur,String alamat) {
		this.nama = nama;
		this.umur = umur;
		this.alamat = alamat;
	}
	
	
	public void validasiData() throws DataTidakLengkapException, DataTidakValidException{
		if(nama.isEmpty()|| alamat.isEmpty()) {
			throw new DataTidakLengkapException();
		}if (umur <0 || umur >120) {
			throw new DataTidakValidException();
		}
	}

}
