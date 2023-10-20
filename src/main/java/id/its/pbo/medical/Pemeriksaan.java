package id.its.pbo.medical;

public class Pemeriksaan {
	
    public void periksaData(Pasien pasien) throws DataTidakLengkapException, DataTidakValidException {
        try {
            pasien.validasiData();
        } catch (DataTidakLengkapException e) {
            throw new DataTidakLengkapException();
        } catch (DataTidakValidException e) {
            throw new DataTidakValidException();
        }
    }
}
