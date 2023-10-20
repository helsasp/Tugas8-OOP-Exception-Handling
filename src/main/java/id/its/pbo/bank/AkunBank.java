package id.its.pbo.bank;

public class AkunBank {
	
	private String nomorAkun;
	private double saldo;
	
	
	public AkunBank(String nomorAkun, double saldo) {
		this.nomorAkun = nomorAkun;
		this.saldo = saldo;
	}

	public void tarik(double jumlah) throws SaldoTidakCukupException, BatasPenarikanException {
		if (jumlah >= 5000) {
            if (saldo < jumlah) {
                throw new SaldoTidakCukupException();
            }
            else 
            throw new BatasPenarikanException();
        }
        else {
            saldo -= jumlah;
        }
        
    }

	
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNomorAkun () {
		return nomorAkun;
	}
}
