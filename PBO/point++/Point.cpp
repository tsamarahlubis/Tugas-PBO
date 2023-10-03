#include "Point.h" 
#include <iostream>
#include <cmath>
using namespace std;
 
Point::Point(int x, int y) : x(x), y(y) { }  
 
// Pengambil publik untuk anggota data pribadi x
int Point::getX() const {
   return x;
}
 
// Penyetel publik untuk anggota data pribadi x
void Point::setX(int x) {
   this->x = x;
}
 
// Pengambil publik untuk anggota data pribadi y
int Point::getY() const {
   return y;
}
 
// Penyetel publik untuk anggota data pribadi y
void Point::setY(int y) {
   this->y = y;
}
 
// Fungsi anggota publik untuk mengatur x dan y
void Point::setXY(int x, int y) {
   this->x = x;
   this->y = y;
}
 
double Point::getMagnitude() const {
   return sqrt(x*x + y*y);    
}
 
double Point::getArgument() const {
   return atan2(y, x);    
}
 
void Point::print() const {
   cout << "(" << x << "," << y << ")" << endl;
}