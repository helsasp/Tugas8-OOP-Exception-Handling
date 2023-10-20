package id.its.pbo.course;

public class KursusProgram {
	
	public static void main (String [] args) {
		
			KursusOnline kursus = new KursusOnline();
			
			Peserta peserta1 = new Peserta ("Bella",36,"SMA");
			Peserta peserta2 = new Peserta ("Helsa",7,"Sarjana");
			Peserta peserta3 = new Peserta("Mike", 55, "Magister");
			
			
			try {
	            peserta1.cekKelayakan();
	            kursus.daftarPeserta(peserta1);
	            System.out.println("Peserta 1 berhasil mendaftar.");
	        } catch (UsiaTidakMemenuhiSyaratException | PendidikanTidakMemenuhiSyaratException e) {
	            System.out.println("Gagal mendaftarkan Peserta 1: " + e.getMessage());
	        }

	        try {
	            peserta2.cekKelayakan();
	            kursus.daftarPeserta(peserta2);
	            System.out.println("Peserta 2 berhasil mendaftar.");
	        } catch (UsiaTidakMemenuhiSyaratException | PendidikanTidakMemenuhiSyaratException e) {
	            System.out.println("Gagal mendaftarkan Peserta 2: " + e.getMessage());
	        }

	        try {
	            peserta3.cekKelayakan();
	            kursus.daftarPeserta(peserta3);
	            System.out.println("Peserta 3 berhasil mendaftar.");
	        } catch (UsiaTidakMemenuhiSyaratException | PendidikanTidakMemenuhiSyaratException e) {
	            System.out.println("Gagal mendaftarkan Peserta 3: " + e.getMessage());
	        } finally {
	            System.out.println("Proses pendaftaran selesai.");
	        }
		
			
	}

}