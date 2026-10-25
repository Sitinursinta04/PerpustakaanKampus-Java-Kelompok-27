/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemenperpustakaan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Lenovo
 */
public class SistemPerpustakaan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array 1 Dimensi
        String[] kategoriBuku = {
            "Pemrograman",
            "Matematika",
            "Jaringan Komputer",
            "Basis Data"
        };

        // Array 2 Dimensi
        int[][] jumlahPeminjaman = {
            {5, 3, 4, 2, 6, 3, 4},
            {2, 4, 3, 1, 5, 2, 3},
            {3, 2, 5, 4, 2, 4, 3},
            {4, 3, 2, 5, 3, 4, 2}
        };

        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat",
            "Sabtu",
            "Minggu"
        };

        // Array 3 Dimensi
        String[][][] lokasiBuku = new String[2][3][4];

        lokasiBuku[0][0][0] = "Buku Java Dasar";
        lokasiBuku[0][0][1] = "Buku Python Dasar";
        lokasiBuku[0][1][0] = "Buku Matematika Diskrit";
        lokasiBuku[1][0][0] = "Buku Jaringan Komputer";
        lokasiBuku[1][1][0] = "Buku Basis Data";
        lokasiBuku[1][2][0] = "Buku Sistem Informasi";

        // ArrayList
        ArrayList<String> daftarBuku = new ArrayList<>();

        daftarBuku.add("Buku Java Dasar");
        daftarBuku.add("Buku Python Dasar");
        daftarBuku.add("Buku Jaringan Komputer");
        daftarBuku.add("Buku Basis Data");
        daftarBuku.add("Buku Matematika Diskrit");
        daftarBuku.add("Buku Sistem Informasi");

        // Stack
        Stack<String> riwayatTransaksi = new Stack<>();

        // Queue
        Queue<String> antreanMahasiswa = new LinkedList<>();

        int pilihan;

        do {

            System.out.println("\n==============================================");
            System.out.println("       SISTEM MANAJEMEN PERPUSTAKAAN");
            System.out.println("==============================================");
            System.out.println("1. Lihat Kategori Buku");
            System.out.println("2. Kelola Daftar Buku");
            System.out.println("3. Lihat Data Peminjaman");
            System.out.println("4. Cek Lokasi Buku");
            System.out.println("5. Riwayat Transaksi");
            System.out.println("6. Antrean Peminjaman");
            System.out.println("7. Keluar");
            System.out.println("==============================================");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                // Array 1 Dimensi
                case 1:

                    System.out.println("\n=== KATEGORI BUKU ===");

                    for (int i = 0; i < kategoriBuku.length; i++) {
                        System.out.println(
                            (i + 1) + ". " + kategoriBuku[i]
                        );
                    }

                    break;

                // ArrayList
                case 2:

                    int pilihanBuku;

                    do {

                        System.out.println("\n=== KELOLA DAFTAR BUKU ===");
                        System.out.println("1. Tampilkan Buku");
                        System.out.println("2. Tambah Buku");
                        System.out.println("3. Hapus Buku");
                        System.out.println("4. Kembali");

                        System.out.print("Pilih: ");
                        pilihanBuku = input.nextInt();
                        input.nextLine();

                        switch (pilihanBuku) {

                            case 1:

                                System.out.println("\n=== DAFTAR BUKU ===");

                                if (daftarBuku.isEmpty()) {

                                    System.out.println(
                                        "Belum ada buku."
                                    );

                                } else {

                                    for (int i = 0;
                                         i < daftarBuku.size();
                                         i++) {

                                        System.out.println(
                                            (i + 1) + ". "
                                            + daftarBuku.get(i)
                                        );
                                    }
                                }

                                break;

                            case 2:

                                System.out.print(
                                    "Masukkan nama buku: "
                                );

                                String bukuBaru = input.nextLine();

                                daftarBuku.add(bukuBaru);

                                System.out.println(
                                    "Buku berhasil ditambahkan."
                                );

                                break;

                            case 3:

                                if (daftarBuku.isEmpty()) {

                                    System.out.println(
                                        "Daftar buku kosong."
                                    );

                                } else {

                                    System.out.println(
                                        "\n=== DAFTAR BUKU ==="
                                    );

                                    for (int i = 0;
                                         i < daftarBuku.size();
                                         i++) {

                                        System.out.println(
                                            (i + 1) + ". "
                                            + daftarBuku.get(i)
                                        );
                                    }

                                    System.out.print(
                                        "Masukkan nomor buku "
                                        + "yang ingin dihapus: "
                                    );

                                    int nomor = input.nextInt();
                                    input.nextLine();

                                    if (nomor >= 1
                                            && nomor <= daftarBuku.size()) {

                                        String bukuDihapus =
                                            daftarBuku.remove(nomor - 1);

                                        System.out.println(
                                            bukuDihapus
                                            + " berhasil dihapus."
                                        );

                                    } else {

                                        System.out.println(
                                            "Nomor buku tidak valid."
                                        );
                                    }
                                }

                                break;

                            case 4:

                                System.out.println(
                                    "Kembali ke menu utama."
                                );

                                break;

                            default:

                                System.out.println(
                                    "Pilihan tidak valid."
                                );
                        }

                    } while (pilihanBuku != 4);

                    break;

                // Array 2 Dimensi
                case 3:

                    System.out.println("\n=== DATA PEMINJAMAN ===");

                    System.out.printf(
                        "%-25s", "Kategori"
                    );

                    for (String h : hari) {

                        System.out.printf(
                            "%-10s", h
                        );
                    }

                    System.out.println();

                    for (int i = 0;
                         i < kategoriBuku.length;
                         i++) {

                        System.out.printf(
                            "%-25s",
                            kategoriBuku[i]
                        );

                        for (int j = 0;
                             j < hari.length;
                             j++) {

                            System.out.printf(
                                "%-10d",
                                jumlahPeminjaman[i][j]
                            );
                        }

                        System.out.println();
                    }

                    break;

                // Array 3 Dimensi
                case 4:

                    System.out.println(
                        "\n=== LOKASI PENYIMPANAN BUKU ==="
                    );

                    for (int i = 0;
                         i < lokasiBuku.length;
                         i++) {

                        for (int j = 0;
                             j < lokasiBuku[i].length;
                             j++) {

                            for (int k = 0;
                                 k < lokasiBuku[i][j].length;
                                 k++) {

                                if (lokasiBuku[i][j][k] != null) {

                                    System.out.println(
                                        lokasiBuku[i][j][k]
                                        + " → Lantai "
                                        + (i + 1)
                                        + ", Rak "
                                        + (j + 1)
                                        + ", Posisi "
                                        + (k + 1)
                                    );
                                }
                            }
                        }
                    }

                    break;

                // Stack
                case 5:

                    System.out.println(
                        "\n=== RIWAYAT TRANSAKSI ==="
                    );

                    if (riwayatTransaksi.isEmpty()) {

                        System.out.println(
                            "Belum ada transaksi."
                        );

                    } else {

                        System.out.println(
                            "Transaksi terakhir: "
                            + riwayatTransaksi.peek()
                        );

                        System.out.println(
                            "\nSeluruh riwayat transaksi:"
                        );

                        for (int i = riwayatTransaksi.size() - 1;
                             i >= 0;
                             i--) {

                            System.out.println(
                                (riwayatTransaksi.size() - i)
                                + ". "
                                + riwayatTransaksi.get(i)
                            );
                        }

                        System.out.print(
                            "\nBatalkan transaksi terakhir? (y/n): "
                        );

                        String jawab = input.nextLine();

                        if (jawab.equalsIgnoreCase("y")) {

                            String transaksiBatal =
                                riwayatTransaksi.pop();

                            System.out.println(
                                "Transaksi dibatalkan: "
                                + transaksiBatal
                            );

                        } else {

                            System.out.println(
                                "Transaksi tidak dibatalkan."
                            );
                        }
                    }

                    break;

                // Queue
                case 6:

                    int pilihanQueue;

                    do {

                        System.out.println(
                            "\n=== ANTREAN PEMINJAMAN ==="
                        );

                        System.out.println(
                            "1. Tambah Mahasiswa ke Antrean"
                        );

                        System.out.println(
                            "2. Lihat Antrean"
                        );

                        System.out.println(
                            "3. Proses Peminjaman"
                        );

                        System.out.println(
                            "4. Kembali"
                        );

                        System.out.print("Pilih: ");
                        pilihanQueue = input.nextInt();
                        input.nextLine();

                        switch (pilihanQueue) {

                            case 1:

                                System.out.print(
                                    "Masukkan nama mahasiswa: "
                                );

                                String nama =
                                    input.nextLine();

                                antreanMahasiswa.offer(nama);

                                System.out.println(
                                    nama
                                    + " masuk ke antrean."
                                );

                                break;

                            case 2:

                                if (antreanMahasiswa.isEmpty()) {

                                    System.out.println(
                                        "Antrean masih kosong."
                                    );

                                } else {

                                    System.out.println(
                                        "\n=== DAFTAR ANTREAN ==="
                                    );

                                    int nomorAntrean = 1;

                                    for (String mahasiswa
                                            : antreanMahasiswa) {

                                        System.out.println(
                                            nomorAntrean
                                            + ". "
                                            + mahasiswa
                                        );

                                        nomorAntrean++;
                                    }
                                }

                                break;

                            case 3:

                                if (antreanMahasiswa.isEmpty()) {

                                    System.out.println(
                                        "Antrean masih kosong."
                                    );

                                } else if (daftarBuku.isEmpty()) {

                                    System.out.println(
                                        "Tidak ada buku yang tersedia."
                                    );

                                } else {

                                    String mahasiswa =
                                        antreanMahasiswa.poll();

                                    System.out.println(
                                        "\nMahasiswa yang dilayani: "
                                        + mahasiswa
                                    );

                                    System.out.println(
                                        "\n=== PILIH BUKU ==="
                                    );

                                    for (int i = 0;
                                         i < daftarBuku.size();
                                         i++) {

                                        System.out.println(
                                            (i + 1)
                                            + ". "
                                            + daftarBuku.get(i)
                                        );
                                    }

                                    System.out.print(
                                        "Pilih nomor buku: "
                                    );

                                    int nomorBuku =
                                        input.nextInt();
                                    input.nextLine();

                                    if (nomorBuku >= 1
                                            && nomorBuku
                                            <= daftarBuku.size()) {

                                        String bukuDipinjam =
                                            daftarBuku.get(
                                                nomorBuku - 1
                                            );

                                        // Menentukan kategori buku
                                        int indeksKategori = -1;

                                        if (bukuDipinjam.contains("Java")
                                                || bukuDipinjam.contains("Python")) {

                                            indeksKategori = 0;

                                        } else if (
                                                bukuDipinjam.contains(
                                                    "Matematika")) {

                                            indeksKategori = 1;

                                        } else if (
                                                bukuDipinjam.contains(
                                                    "Jaringan")) {

                                            indeksKategori = 2;

                                        } else if (
                                                bukuDipinjam.contains(
                                                    "Basis Data")) {

                                            indeksKategori = 3;

                                        } else if (
                                                bukuDipinjam.contains(
                                                    "Sistem Informasi")) {

                                            indeksKategori = 0;
                                        }

                                        // Memilih hari peminjaman
                                        System.out.println(
                                            "\n=== PILIH HARI ==="
                                        );

                                        for (int i = 0;
                                             i < hari.length;
                                             i++) {

                                            System.out.println(
                                                (i + 1)
                                                + ". "
                                                + hari[i]
                                            );
                                        }

                                        System.out.print(
                                            "Pilih hari: "
                                        );

                                        int pilihanHari =
                                            input.nextInt();
                                        input.nextLine();

                                        if (pilihanHari >= 1
                                                && pilihanHari
                                                <= hari.length) {

                                            // Mengubah data Array 2D
                                            if (indeksKategori != -1) {

                                                jumlahPeminjaman[
                                                    indeksKategori
                                                ][pilihanHari - 1]++;
                                            }

                                            // Mencari lokasi buku
                                            boolean lokasiDitemukan =
                                                false;

                                            for (int i = 0;
                                                 i < lokasiBuku.length;
                                                 i++) {

                                                for (int j = 0;
                                                     j < lokasiBuku[i].length;
                                                     j++) {

                                                    for (int k = 0;
                                                         k < lokasiBuku[i][j].length;
                                                         k++) {

                                                        if (bukuDipinjam.equals(
                                                                lokasiBuku[i][j][k])) {

                                                            System.out.println(
                                                                "\nLokasi buku: "
                                                                + "Lantai "
                                                                + (i + 1)
                                                                + ", Rak "
                                                                + (j + 1)
                                                                + ", Posisi "
                                                                + (k + 1)
                                                            );

                                                            lokasiDitemukan =
                                                                true;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!lokasiDitemukan) {

                                                System.out.println(
                                                    "\nLokasi buku "
                                                    + "belum tersedia."
                                                );
                                            }

                                            // Menyimpan transaksi ke Stack
                                            String transaksi =
                                                mahasiswa
                                                + " meminjam "
                                                + bukuDipinjam
                                                + " pada hari "
                                                + hari[pilihanHari - 1];

                                            riwayatTransaksi.push(
                                                transaksi
                                            );

                                            System.out.println(
                                                "\nPeminjaman berhasil."
                                            );

                                            System.out.println(
                                                "Transaksi disimpan "
                                                + "ke riwayat."
                                            );

                                        } else {

                                            System.out.println(
                                                "Pilihan hari tidak valid."
                                            );
                                        }

                                    } else {

                                        System.out.println(
                                            "Nomor buku tidak valid."
                                        );
                                    }
                                }

                                break;

                            case 4:

                                System.out.println(
                                    "Kembali ke menu utama."
                                );

                                break;

                            default:

                                System.out.println(
                                    "Pilihan tidak valid."
                                );
                        }

                    } while (pilihanQueue != 4);

                    break;

                // Keluar
                case 7:

                    System.out.println(
                        "\nTerima kasih telah menggunakan "
                        + "Sistem Manajemen Perpustakaan."
                    );

                    break;

                default:

                    System.out.println(
                        "\nPilihan menu tidak valid."
                    );
            }

        } while (pilihan != 7);

        input.close();
    }
}