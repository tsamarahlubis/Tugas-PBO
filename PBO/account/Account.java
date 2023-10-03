public class Account {
   // Variabel Private
   private int number;
   private double balance;

   /** Membuat instance Akun dengan nomor yang diberikan dan saldo awal 0 */
   public Account(int number) {
      this.number = number;
      this.balance = 0.0;  // "this." optional
   }
   /** Membuat instance Akun dengan nomor dan saldo awal yang diberikan */
   public Account(int number, double balance) {
      this.number = number;
      this.balance = balance;
   }

   /** Mengembalikan nomor */
   public int getNumber() {
      return this.number;  // "this." optional
   }
   /** Mengembalikan saldo */
   public double getBalance() {
      return this.balance;  // "this." optional
   }

   /** Mengembalikan deskripsi string dari instance ini */
   public String toString() {
      return String.format("Account[number=%d,balance=$%.2f]", number, balance);
   }

   /** Tambahkan jumlah tertentu ke saldo */
   public void credit(double amount) {
      balance += amount;
   }

   /** Kurangi jumlah tertentu dari saldo, jika saldo >= jumlah */
   public void debit(double amount) {
      if (balance >= amount) {
         balance -= amount;
      } else {
         System.out.println("amount exceeded");
      }
   }

   /** Transfer sejumlah tertentu ke Rekening lain, jika saldo >= jumlah */
   public void transferTo(double amount, Account another) {
      if (balance >= amount) {
         this.balance -= amount;
         another.balance += amount;
      } else {
         System.out.println("amount exceeded");
      }
   }
}