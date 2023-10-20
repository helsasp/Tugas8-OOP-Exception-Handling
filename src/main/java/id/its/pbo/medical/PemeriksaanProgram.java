package id.its.pbo.medical;

public class PemeriksaanProgram {
	
	public static void main (String [] args) {
		
		Pasien pasien1 = new Pasien ("Helsa", 18,"Jl. Wisma Permai");
		Pasien pasien2 = new Pasien ("Harry", 30,"Avenue St. 77");
		Pasien pasien3 = new Pasien("", 45, "Jl. ITS No. 456");
		
		Pemeriksaan pemeriksaan = new Pemeriksaan();
		
		
		try {
            pemeriksaan.periksaData(pasien1);
            System.out.println("Data pasien 1 valid.");
        } catch (DataTidakLengkapException e) {
            System.out.println("Gagal memeriksa data pasien 1: " + e.getMessage());
        } catch (DataTidakValidException e) {
            System.out.println("Gagal memeriksa data pasien 1: " + e.getMessage());
        }

        try {
            pemeriksaan.periksaData(pasien2);
            System.out.println("Data pasien 2 valid.");
        } catch (DataTidakLengkapException e) {
            System.out.println("Gagal memeriksa data pasien 2: " + e.getMessage());
        } catch (DataTidakValidException e) {
            System.out.println("Gagal memeriksa data pasien 2: " + e.getMessage());
        }

        try {
            pemeriksaan.periksaData(pasien3);
            System.out.println("Data pasien 3 valid.");
        } catch (DataTidakLengkapException e) {
            System.out.println("Gagal memeriksa data pasien 3: " + e.getMessage());
        } catch (DataTidakValidException e) {
            System.out.println("Gagal memeriksa data pasien 3: " + e.getMessage());
        }
   
    }
	}
	
	
	


