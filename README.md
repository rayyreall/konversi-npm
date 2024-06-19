# 📚 NPM Convertion

## Deskripsi

Program ini digunakan untuk melakukan konversi NPM Mahasiswa yang dimasukkan oleh pengguna. Program akan memproses NPM yang valid, memecahnya menjadi beberapa komponen (tahun masuk, kode fakultas, kode prodi, dll.), dan menampilkan informasi mahasiswa berdasarkan NPM tersebut.

## Struktur Proyek

- `Main.java`: Berisi logika utama program.
- `MahasiswaEntity.java`: Kelas model untuk menyimpan informasi mahasiswa.
- `Npm.java`: Berisi logika untuk memvalidasi dan mengonversi NPM menjadi objek `MahasiswaEntity`.

## Cara Menggunakan

1. Jalankan program.
2. Masukkan NPM ketika diminta.
3. Program akan menampilkan informasi mahasiswa jika NPM valid.
4. Pengguna dapat memilih untuk mengulang program atau keluar.

## Contoh Tampilan Program

```plaintext
Masukkan NPM anda (ketik q untuk keluar): 2210010466
----------------[DATA MAHASISWA]--------------
NPM             : 2210010466
Tahun masuk     : 2022
Kode fakultas   : 10
Kode prodi      : 01
Nama prodi      : Teknik Informatika
Urutan masuk    : 0466
-----------------------------------------------
Apakah anda ingin mengulang Program lagi (y/n)? n
[TERMINATE] Program anda telah berakhir
```

![Contoh Tampilan Program](images/tampilan-program.png)


## [NOTE]
- ```java throw``` (berfungsi mirip seperti return tetapi dia digunakan untuk kesalahan pada program kita)
- ```java new Exception("Pesan Kesalahannya")``` (Berfungsi untuk mengembalikan kesalahan apa yang dilakukan user agar di tangkap melalui ```java try {...} catch (e Exception) { ... }```
- ```java text.equals("")``` (Berfungsi untuk mengecek apakah String itu memiliki teks yang sama persis)
- ```java "\t"``` (Berfungsi membuat jarak seperti fitur tab pada microsoft word)
- ```java NumberFormatException ``` (Ini adalah salah satu jenis Exception / Error Jika format Number tidak sesuai)
