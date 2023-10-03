public class Circle {    // Save as "Circle.java"
   // public constants
   public static final double DEFAULT_RADIUS = 1.0;
   public static final String DEFAULT_COLOR  = "red";
   
   // variabel instan pribadi
   private double radius;
   private String color;
   
   /** Membangun Lingkaran dengan radius dan warna default */
   public Circle() {                   
      this.radius = DEFAULT_RADIUS;
      this.color  = DEFAULT_COLOR;
   }
   /** Membangun Lingkaran dengan radius tertentu dan warna default */
   public Circle(double radius) {      
      this.radius = radius;
      this.color = DEFAULT_COLOR;
   }
   /** Membuat Lingkaran dengan jari-jari dan warna tertentu */
   public Circle(double radius, String color) { 
      this.radius = radius;
      this.color = color;
   }
   
   /** Mengembalikan radius - pengambil publik untuk radius variabel pribadi. */
   public double getRadius() {
      return this.radius;
   }
   /** Menyetel radius - penyetel publik untuk radius variabel pribadi */
   public void setRadius(double radius) {
      this.radius = radius;
   }
   /** Mengembalikan warna - pengambil publik untuk warna variabel pribadi */
   public String getColor() {
      return this.color;
   }
   /** Menyetel warna - penyetel publik untuk warna variabel pribadi */
   public void setColor(String color) {
      this.color = color;
   }
 
   /** Mengembalikan string deskriptif diri untuk contoh Lingkaran ini */
   public String toString() {
      return "Circle[radius=" + radius + ", color=" + color + "]";
   }
 
   /** Mengembalikan luas Lingkaran ini*/
   public double getArea() {
      return radius * radius * Math.PI;
   }
 
   /** Mengembalikan keliling Lingkaran ini */
   public double getCircumference() {
      return 2.0 * radius * Math.PI;
   }
}