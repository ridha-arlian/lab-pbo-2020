Ridha Arlian Alhaqie
1908107010075

Deskripsi

- Ini merupakan sebuah program yang digunakan untuk menaik dan menurunkan penumpang pada bus
- Program ini bertujuan untuk memenuhi Tugas praktikum pada Lab Pemrograman Berbasis Objek

Penjelasan File Pada Program
Class Penumpang
- Class ini mewakili entitas penumpang bus
- Satu objek penumpang mewakili satu penumpang
- Setiap penumpang mempunyai attribut nama, umur, dan status hamil
- Method Penumpang() merupakan method constructor yang akan memberikan nilai 
  awal kepada attribute.
- Method getNama(), getUmur(), dan getHamil() adalah method accessor yang 
  mengembalikan nilai yang diminta.
 
Class Bus
- Class ini mewakili bus
- Class ini memiliki attribute berupa objek dari Class Penumpang
- Attribute penumpangBasa berisi penumpang biasa (minimal 0, maksimal 4)
- Attribute penumpangPrioritas berisi penumpang prioritas (minimal 0, maksimal 2)
- Anda boleh menggunakan Struktur data Array ataupun ArrayList untuk menampung 
  data penumpang.
- Method getPenumpang() mengembalikan list penumpang yang diminta.
- Method getJumlahPenumpang() mengembalikan jumlah penumpang yang diminta. 
- Method NaikPenumpang() berfungsi untuk menambahkan penumpang ke dalam Bus 
  (jika ada kursi untuk penumpang tsb). Method ini mengembalikan true jika penumpang
  berhasil naik dan menambahkan penumpang tsb ke dalam Array penumpang, dan
  mengembalikan false jika penumpang tidak bias naik.
- Method turunkanPenumpang(nama) menerima parameter nama penumpang. Jika nama
  penumpang ditemukan, maka hapus penumpang tersebut dari Array penumpang dan
  kembalikan nilai true. Sebaliknya, kembalikan false. 
- Method toString() untuk mencetak daftar nama Penumpang Biasa, Penumpang
  Prioritas, dan Jumlah semua penumpang. 

Class Main 
 Pada method main() dideklarasikan sebuah objek Bus. Method ini digunakan untuk menjalankan
 mensimulasikan program.

Instalasi Program
- javac Bus.java
- javac Penumpang.java
- javac Main.java

Run Program
- java Main