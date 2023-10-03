public class TestTime {
   public static void main(String[] args) {
      // Uji Konstruktor dan toString()
      Time t1 = new Time(1, 2, 3);
      System.out.println(t1);  
      Time t2 = new Time();   
      System.out.println(t2);

      // Test Setters dan Getters
      t1.setHour(4);
      t1.setMinute(5);
      t1.setSecond(6);
      System.out.println(t1);  
      System.out.println("Hour is: " + t1.getHour());
      //Hour is: 4
      System.out.println("Minute is: " + t1.getMinute());
      //Minute is: 5
      System.out.println("Second is: " + t1.getSecond());
      //Second is: 6

      // Test setTime()
      t1.setTime(58, 59, 23);
      System.out.println(t1);
      //23:59:58

      // Test nextSecond() dan chaining
      System.out.println(t1.nextSecond());
      System.out.println(t1.nextSecond().nextSecond().nextSecond());  // chaining
   }
}