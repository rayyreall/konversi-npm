# 📚 NPM Convertion

## Deskripsi

Program ini digunakan untuk melakukan konversi NPM Mahasiswa yang dimasukkan oleh pengguna. Program akan memproses NPM yang valid, memecahnya menjadi beberapa komponen (tahun masuk, kode fakultas, kode prodi, dll.), dan menampilkan informasi mahasiswa berdasarkan NPM tersebut.

## Struktur Proyek

- `Main.java`: Berisi logika utama program.
- `MahasiswaEntity.java`: Kelas model untuk menyimpan informasi mahasiswa.
- `Npm.java`: Berisi logika untuk memvalidasi dan mengonversi NPM menjadi objek `MahasiswaEntity`.

---

# 📥 Cara Download Program dari GitHub

Ingin mendapatkan salinan dari program kami? Ikuti langkah-langkah mudah di bawah ini untuk mengunduhnya langsung dari GitHub!

## Langkah-langkah Download manual

### 1. Kunjungi Repositori GitHub
1. Buka browser favorit Anda.
2. Pergi ke halaman repositori GitHub kami di: [https://github.com/username/repository-name](https://github.com/rayyreall/konversi-npm)

### 2. Download sebagai ZIP
1. Cari tombol **Code** di bagian atas halaman repositori.
2. Klik tombol **Code** tersebut untuk membuka menu drop-down.
3. Pilih opsi **Download ZIP** dari menu yang muncul.

   

### 3. Ekstrak File ZIP
1. Setelah file ZIP selesai diunduh, buka folder tempat file tersebut disimpan.
2. Klik kanan pada file ZIP tersebut, lalu pilih **Extract All...** atau gunakan alat ekstraksi ZIP lainnya.
3. Pilih lokasi untuk mengekstrak file, lalu klik **Extract**.

### 4. Selesai!
Anda sekarang memiliki salinan dari program kami di komputer Anda. Buka folder hasil ekstraksi untuk melihat kode sumber dan file terkait lainnya.


---

# 🚀 Cara Install Program Menggunakan Git

Untuk menggunakan program kami, Anda perlu mengikuti langkah-langkah berikut untuk mengunduh dan menginstall menggunakan Git.

## Langkah-langkah Install

### 1. Buka Terminal atau Command Prompt
1. Buka Terminal atau Command Prompt di komputer Anda.

### 2. Clone Repositori
1. Salin repositori ke komputer lokal dengan perintah berikut:

   ```bash
   git clone https://github.com/rayyreall/konversi-npm.git
   ```
2. Masuk ke direktori repositori yang baru saja Anda clone:

   ```bash
   cd konversi-npm
   ```
### 4. Selesai!
Anda sekarang memiliki salinan dari program kami di komputer Anda. Silakan buka menggunakan text Editor Kesayangan anda!

---

# Cara Menggunakan

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
