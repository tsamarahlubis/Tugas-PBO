#include <iostream>
#include <iomanip>
#include "Account.h"
using namespace std;
 
Account::Account(int no, double b) : accountNumber(no), balance(b) { }
 
// Pengambil publik untuk nomor akun anggota data pribadi
int Account::getAccountNumber() const {
   return accountNumber;
}
 
// Pengambil publik untuk saldo data pribadi anggota
double Account::getBalance() const {
   return balance;
}
 
// Penyetel publik untuk saldo anggota data pribadi
void Account::setBalance(double b) {
   balance = b;
}
 
// Menambahkan jumlah tertentu ke saldo
void Account::credit(double amount) {
   balance += amount;
}
 
// Kurangi jumlah yang diberikan dari saldo
void Account::debit(double amount) {
   if (amount <= balance) {
      balance -= amount;
   } else {
      cout << "Amount withdrawn exceeds the current balance!" << endl;
   }
}
 
// Cetak deskripsi untuk contoh Akun ini
void Account::print() const {
   cout << fixed << setprecision(2);
   cout << "A/C no: " << accountNumber << " Balance=$" << balance << endl;
}