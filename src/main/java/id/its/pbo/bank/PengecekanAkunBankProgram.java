package id.its.pbo.bank;

public class PengecekanAkunBankProgram {
    public static void main(String [] args) {
        Bank bank = new Bank();

        
        try {
            AkunBank akun1 = new AkunBank("HS1324", 1923.77);
            AkunBank akun2 = new AkunBank("JS2645",345.32);
            
            bank.tambahAkun(akun1);
            bank.tambahAkun(akun2);
            
            akun1.tarik(234.0);
            akun2.tarik(7000.0);
        } 
        catch(BatasPenarikanException e) {
            System.out.println(e.getMessage());
        }
        catch(SaldoTidakCukupException e) {
            System.out.println(e.getMessage());
        }
       
    }
}