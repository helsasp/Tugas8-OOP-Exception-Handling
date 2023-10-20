package id.its.pbo.course;

import java.util.List;
import java.util.ArrayList;

public class KursusOnline {
	
	private List <Peserta> daftarPeserta = new ArrayList<>();

	
	public void daftarPeserta (Peserta peserta)  throws UsiaTidakMemenuhiSyaratException, PendidikanTidakMemenuhiSyaratException {
		peserta.cekKelayakan();
		daftarPeserta.add(peserta);
	}
	
	public List <Peserta> getDaftarPeserta() {
		return daftarPeserta;
	}
	
	
}
