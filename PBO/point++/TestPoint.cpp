#include <iostream>
#include <iomanip>
#include "Point.h"   // using Point class
using namespace std;
 
int main() {
   
   Point p1(3, 4);
   p1.print();
   cout << "x = " << p1.getX() << endl;
   cout << "y = " << p1.getY() << endl;
   cout << fixed << setprecision(2);
   cout << "mag = " << p1.getMagnitude() << endl;
   cout << "arg = " << p1.getArgument() << endl;
   p1.setX(6);
   p1.setY(8);
   p1.print();
   p1.setXY(1, 2);
   p1.print();
 
   Point p2;
   p2.print();
}