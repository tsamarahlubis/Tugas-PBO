public class TestPoint {
   public static void main(String[] args) {
      // Test constructors dan toString()
      Point p1 = new Point(1, 2);
      System.out.println(p1);  // toString()
      Point p2 = new Point();  
      System.out.println(p2);

      // Test Setters dan Getters
      p1.setX(3);
      p1.setY(4);
      System.out.println(p1);  
      System.out.println("X is: " + p1.getX());
      //X is: 3
      System.out.println("Y is: " + p1.getY());
      //Y is: 4

      // Test setXY() dan getXY()
      p1.setXY(5, 6);
      System.out.println(p1);  
      System.out.println("X is: " + p1.getXY()[0]);
      //X is: 5
      System.out.println("Y is: " + p1.getXY()[1]);
      //Y is: 6

      p2.setXY(10, 11);
      System.out.printf("Distance is: %.2f%n", p1.distance(10, 11));
      //Distance is: 7.07
      System.out.printf("Distance is: %.2f%n", p1.distance(p2));
      //Distance is: 7.07
      System.out.printf("Distance is: %.2f%n", p2.distance(p1));
      //Distance is: 7.07
      System.out.printf("Distance is: %.2f%n", p1.distance());
      //Distance is: 7.81
   }
}