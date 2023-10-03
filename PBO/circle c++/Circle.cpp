#include "Circle.h" 
Circle::Circle(double r, string c) {
   radius = r;
   color = c;
}
 
// Pengambil publik untuk radius anggota data pribadi
double Circle::getRadius() const {
   return radius;
}
 
// Penyetel publik untuk radius anggota data pribadi
void Circle::setRadius(double r) {
   radius = r;
}
 
// Pengambil publik untuk warna anggota data pribadi
string Circle::getColor() const {
   return color;
}
 
// Penyetel publik untuk warna anggota data pribadi
void Circle::setColor(string c) {
   color = c;
}

double Circle::getArea() const {
   return radius*radius*3.14159265;
}