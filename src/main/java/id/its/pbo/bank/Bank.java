package id.its.pbo.bank;

import java.util.List;
import java.util.ArrayList;

public class Bank {
	private List <AkunBank> daftarAkun = new ArrayList<>();
	
	
	
	public void tambahAkun (AkunBank akun) {
		daftarAkun.add(akun);
	}
	
	public AkunBank cariAkun (String nomorAkun) throws BatasPenarikanException {
		for(AkunBank akun : daftarAkun) {
			if(akun.getNomorAkun().equals(nomorAkun)) {
				return akun;
			}
				
		}
		throw new BatasPenarikanException();
	}

}
