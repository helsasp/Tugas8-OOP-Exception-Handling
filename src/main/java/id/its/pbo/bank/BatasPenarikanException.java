package id.its.pbo.bank;

public class BatasPenarikanException extends Exception {
	
    public BatasPenarikanException() {
        super("Akun tidak ditemukan!");
    }
}
