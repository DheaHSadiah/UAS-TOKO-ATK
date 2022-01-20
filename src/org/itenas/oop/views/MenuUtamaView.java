package org.itenas.oop.views;

import java.util.Scanner;

public class MenuUtamaView {
	public static void main(String[] args) {
		menuUtama();
	}
	public static void menuUtama() {
		int menu;
		Scanner mainScanner = new Scanner(System.in);
		System.out.println();		        
        System.out.println("              =========================================                  ");
        System.out.println("              |      Selamat Datang Di Menu Utama     |                  ");
        System.out.println("              =========================================                  ");
        System.out.println("              | Pilihan:                              |                  ");
        System.out.println("              |        1. Data Barang ATK             |                  ");
        System.out.println("              |        2. Data Pegawai                |                  ");
        System.out.println("              |        3. Data Transaksi              |                  ");
        System.out.println("              |        4. Keluar Aplikasi             |                  ");
        System.out.println("              =========================================                  ");	
        System.out.println();
        System.out.print("Pilih menu: ");
        menu = mainScanner.nextInt();
        
        while (!(menu == 1 || menu == 2 || menu == 3)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.println();
        	System.out.print("Silahkan pilih menu kembali: ");
        	menu = mainScanner.nextInt();
        }
        
        switch (menu) {
        case 1:
        	BarangATKView.displaymenuBarangATK();
        	break;
        case 2:
        	System.out.println("lul");
        	break;
        case 3:
        	TransaksiView.displaymenuTransaksi();
        case 4:
        	System.out.println("Terima kasih, Anda Keluar dari aplikasi");
        	System.exit(0);
        default:
        	System.out.println("Pilihan yang anda masukkan salah");
      
        }

        mainScanner.close();
	}
}
