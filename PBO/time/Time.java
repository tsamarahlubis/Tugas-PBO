public class Time {
    private int second, minute, hour;

    public Time(int second, int minute, int hour) {
       this.second = second;
       this.minute = minute;
       this.hour = hour;
    }

    public Time() {  
       this.second = 0;
       this.minute = 0;
       this.hour = 0;
    }
 
    // Pengambil/penyetel publik untuk variabel privat.
    /** Mengembalikan second / detik */
    public int getSecond() {
       return this.second;
    }
    /** Mengembalikan minute / menit */
    public int getMinute() {
       return this.minute;
    }
    /** Mengembalikan hour / jam */
    public int getHour() {
       return this.hour;
    }
    /** Atur second / detik */
    public void setSecond(int second) {
       this.second = second;
    }
    /** Atur minute / menit */
    public void setMinute(int minute) {
       this.minute = minute;
    }
    /** Atur hour / jam */
    public void setHour(int hour) {
       this.hour = hour;
    }
 
    public String toString() {
         return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int second, int minute, int hour) {
       this.second = second;
       this.minute = minute;
       this.hour = hour;
    }

    public Time nextSecond() {
       ++second;
       if (second >= 60) {
          second = 0;
          ++minute;
          if (minute >= 60) {
             minute = 0;
             ++hour;
             if (hour >= 24) {
                hour = 0;
             }
          }
       }
       return this;  
    }
 }