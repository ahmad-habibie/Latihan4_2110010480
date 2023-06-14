/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author ahmad
 */
public class Main {
    public static void main(String[] args) {
        String nama = "Ahmad Habibie";
        String npm = "2110010480";
        int uts = 80;
        int uas = 80;
        int tugas = 60;

        NilaiAkhir nilai = new NilaiAkhir(nama, npm, uts, uas, tugas);

        double nilaiAkhir = nilai.hitungNilaiAkhir();

        System.out.println("Nama: " + nilai.getNama());
        System.out.println("NPM: " + nilai.getNpm());
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
