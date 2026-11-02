
# Kalkulator BMI

Aplikasi Kalkulator BMI merupakan aplikasi desktop berbasis Java yang dikembangkan menggunakan JavaFX untuk membangun Graphical User Interface (GUI). Aplikasi ini dibuat untuk menghitung Body Mass Index (BMI) berdasarkan data nama, jenis kelamin, berat badan, dan tinggi badan yang dimasukkan oleh pengguna.

Aplikasi ini memiliki tampilan sederhana dengan desain bernuansa biru pastel agar mudah digunakan oleh pengguna.

## Fitur

- Input nama pengguna.
- Pilihan jenis kelamin.
- Input berat badan dalam satuan kilogram (kg).
- Input tinggi badan dalam satuan sentimeter (cm).
- Perhitungan Body Mass Index (BMI).
- Menampilkan nilai BMI.
- Menampilkan kategori BMI.
- Validasi input untuk memastikan data yang dimasukkan sesuai.
- Tombol reset untuk menghapus data dan hasil perhitungan.

## Teknologi yang Digunakan

- Java JDK 17
- JavaFX 21
- Apache Maven
- Apache NetBeans IDE
- JavaFX Scene Builder
- FXML

## Tampilan Aplikasi

<img width="1198" height="996" alt="Screenshot 2026-11-02 163245" src="https://github.com/user-attachments/assets/82d4a652-0547-4dc1-9a6b-8ffd648b2ca5" />


## Rumus Perhitungan

Rumus BMI:

BMI = Berat Badan (kg) / Tinggi Badan (m)²

Kategori BMI yang digunakan:

| Nilai BMI | Kategori |
|---|---|
| Kurang dari 18,5 | Berat Badan Kurang |
| 18,5 – kurang dari 25 | Berat Badan Normal |
| 25 – kurang dari 30 | Berat Badan Berlebih |
| 30 atau lebih | Obesitas |

## Struktur Project

```text
kalkulatorBMI/
├── src/
│   └── main/
│       ├── java/
│       │   ├── controller/
│       │   │   └── BmiController.java
│       │   ├── main/
│       │   │   └── Main.java
│       │   └── model/
│       │       └── BmiModel.java
│       └── resources/
│           └── fxml/
│               └── KalkulatorView.fxml
├── pom.xml
└── README.md
```

## Cara Menjalankan

### 1. Clone Repository

Buka terminal atau Command Prompt, kemudian jalankan:

```bash
git clone https://github.com/jasminmutiara35-dev/KalkulatorBMI
```

### 2. Masuk ke Direktori Project

```bash
cd kalkulatorBMI
```

### 3. Periksa Instalasi Java dan Maven

Pastikan Java dan Maven sudah terpasang:

```bash
java -version
mvn -version
```

### 4. Buka Project

Buka Apache NetBeans, kemudian pilih **File → Open Project**. Cari folder project `kalkulatorBMI`.

### 5. Jalankan Aplikasi

Buka terminal pada direktori utama project, kemudian jalankan:

```bash
mvn javafx:run
```

Tunggu hingga proses build selesai. Jika berhasil, aplikasi Kalkulator BMI akan terbuka.

## Cara Menggunakan Aplikasi

1. Jalankan aplikasi Kalkulator BMI.
2. Masukkan nama pengguna.
3. Pilih jenis kelamin.
4. Masukkan berat badan dalam satuan kilogram (kg).
5. Masukkan tinggi badan dalam satuan sentimeter (cm).
6. Klik tombol **Hitung BMI**.
7. Hasil nilai BMI dan kategori akan ditampilkan pada aplikasi.
8. Klik tombol **Reset** jika ingin mengulang perhitungan.

## Struktur Program

Program ini menggunakan konsep pemisahan fungsi berdasarkan package:

- **Model:** `BmiModel.java` digunakan untuk melakukan perhitungan BMI dan menentukan kategori BMI.
- **Controller:** `BmiController.java` digunakan untuk mengatur interaksi antara pengguna dan tampilan aplikasi.
- **Main:** `Main.java` digunakan sebagai class utama untuk menjalankan aplikasi JavaFX.
- **FXML:** `KalkulatorView.fxml` digunakan untuk membangun tampilan antarmuka aplikasi.
