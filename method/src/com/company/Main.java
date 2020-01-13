package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] data = {6,5,9,10,22,3,4};
        int total = 0;
        int nilaiTertingi = data[0];

        //untuk mencari nilai rata-rata
        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        int rata = total / data.length;

        System.out.println("-------Praktek Algoritma dan Pemrograman-------");
        System.out.println("Datanya adalah : {6,5,9,10,22,3,4}");

        //cetak rata-rata
        System.out.println("Jadi nilai Rata-ratanya : " + rata);

        //untuk mencetak nilai tertinggi
        for (int i = 0; i < data.length; i++) {
            if (nilaiTertingi < data[i]) {
                nilaiTertingi = data[i];
            }
        }
        System.out.println("Nilai tertingginya : " + nilaiTertingi);

        //mengurutkan nilai dari kiri ke kanan

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] > data[j]) //jika lebih besar maka akan digeser ke arah kiri
                {
                    int hasil = data[i];
                    data[i] = data[j];
                    data[j] = hasil;
                }
            }
        }
        //cetak data yang diurutkan mulai dari Terbesar s/d Terkecil
        System.out.print("Nilai urut dari nilai Tertinggi - Terkecil : ");
        for (int j = 0; j < data.length; j++)
            System.out.print(data[j]+",");

    }
}
