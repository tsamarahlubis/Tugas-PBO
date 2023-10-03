public class TestAccount {
   public static void main(String[] args) {
      // Uji Konstruktor dan toString()
      Account a1 = new Account(5566);
      System.out.println(a1);
      // Rekening[angka=5566,saldo=$0,00]
      Account a2 = new Account(1234, 99.9);
      System.out.println(a2);
      // Rekening[angka=1234,saldo=$99,90]

      // Pengambil tes
      System.out.println("The account Number is: " + a2.getNumber());
      // Nomor rekeningnya adalah: 1234
      System.out.println("The balance is: " + a2.getBalance());
      // Saldonya adalah: 99,9

      // Test credit(), debit() and transferTo()
      a1.credit(11.1);
      System.out.println(a1);
      // Account[number=5566,balance=$11.10]
      a1.debit(5.5);
      System.out.println(a1);
      // Account[number=5566,balance=$5.60]
      a1.debit(500);   // Test debit() error
      // jumlah terlampaui
      System.out.println(a1);

      a2.transferTo(1.0, a1);
      System.out.println(a1);
      // Account[number=5566,balance=$6.60]
      System.out.println(a2);
      // Account[number=1234,balance=$98.90]
    }
}