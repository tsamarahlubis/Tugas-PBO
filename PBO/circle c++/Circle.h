#include <string>   
using namespace std;
 
// Deklarasi Circle class
class Circle {
private:   
   // anggota data pribadi (variabel)
   double radius;
   string color;
 
public:    
   // Mendeklarasikan prototipe fungsi anggota
   Circle(double radius = 1.0, string color = "red");
 
   // Pengambil & penyetel publik untuk anggota data pribadi
   double getRadius() const;
   void setRadius(double radius);
   string getColor() const;
   void setColor(string color);
 
   // Public member Function
   double getArea() const;
};