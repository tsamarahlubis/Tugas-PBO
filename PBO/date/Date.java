public class Date {
   // Variabel instan pribadi
   private int year, month, day;

   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   /** Mengembalikan year / tahun */
   public int getYear() {
      return this.year;
   }
   /** Mengembalikan month / bulan */
   public int getMonth() {
      return this.month;
   }
   /** Mengembalikan day / hari */
   public int getDay() {
      return this.day;
   }
   /** Menetapkan tahun */
   public void setYear(int year) {
      this.year = year;
   }
   /** Menetapkan bulan */
   public void setMonth(int month) {
      this.month = month;
   }
   /** Menetapkan hari */
   public void setDay(int day) {
      this.day = day;
   }

   /* Mengembalikan String deskriptif dalam bentuk "MM/DD/YYYY" dengan awalan nol */
   public String toString() {
        return String.format("%02d/%02d/%4d", month, day, year);
             
   }

   /** Menetapkan tahun, bulan dan hari. Tidak ada validasi masukan */
   public void setDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
}