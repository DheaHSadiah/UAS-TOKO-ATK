package org.itenas.oop.views;

import java.util.List;
import java.util.Scanner;

import org.itenas.oop.DAO.TransaksiDAO;
import org.itenas.oop.DAOImpl.TransaksiDAOImpl;
import org.itenas.oop.bean.Transaksi;

public class FormView {
	
	public static void formInsertBarangATK() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("              =========================================                  ");
        System.out.println("              |      Form Insert Data Barang ATK      |                  ");
        System.out.println("              =========================================                  ");
        System.out.print("              | ID Barang		:");
        barangAtk.setIdbarang(scanner.nextInt());
        System.out.print("              | Nama Barang	        :");
        barangAtk.setNamabarang(scanner2.nextLine());
        System.out.print("              | Merek Barang            :");
        barangAtk.setMerekbarang(scanner2.nextLine());
        System.out.print("              | Harga Barang            :");
        barangAtk.setHargabarang(scanner2.nextInt());
        System.out.print("              | Jumlah Barang           :");
        barangAtk.setJumlahbarang(scanner2.nextInt());
        System.out.println("              ==========================================					 ");
        operation.saveBarangatk(barangAtk);
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
	}
	
	public static void formUpdateBarangATK() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String namabarang;
		char back;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("Masukkan nama dari barang yang akan diupdate : ");
		namabarang = scanner.nextLine();
		System.out.println();
		System.out.println("              ===========================================                 ");
        System.out.println("              |       Form Update Data Barang ATK       |      ");
        System.out.println("              ===========================================                ");
        System.out.print("              | Nama Barang		:");
        System.out.println(namabarang);
        barangAtk.setNamabarang(namabarang);
        System.out.print("              | ID Barang			   :");
        barangAtk.setIdbarang(scanner.nextInt());
        System.out.print("              | Merek Barang            :");
        barangAtk.setMerekbarang(scanner2.nextLine());
        System.out.print("              | Harga Barang            :");
        barangAtk.setHargabarang(scanner2.nextDouble());
        System.out.print("              | Jumlah Barang           :");
        barangAtk.setJumlahbarang(scanner2.nextInt());
        System.out.println("              ============================================");
        operation.updateBarangatk(barangAtk);;
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
        
	
	}
	
	public static void formDeleteBarangATK() {
		Scanner scanner = new Scanner(System.in);
		String namabarang;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("Masukkan nama barang yang akan dihapus : ");
		namabarang = scanner.nextLine();
		barangAtk.setNamabarang(namabarang);
		operation.deleteBarangatk(barangAtk);
		
	}
	
	public static void formSearchBarangATK() {
		Scanner scanner = new Scanner(System.in);
		String namabarang;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("Masukkan Nama Barang yang akan dicari");
		namabarang = scanner.nextLine();
		barangAtk.setNamabarang(namabarang);
		operation.getbarangatkbynamabarang(namabarang);
		
	}
	
	public static void formInsertTransaksi() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
	Transaksi tr = new Transaksi();
	TransaksiDAO operation = new TransaksiDAOImpl();
	System.out.println("              =========================================                  ");
    System.out.println("              |      Form Insert Data Transaksi       |                  ");
    System.out.println("              =========================================                  ");
    System.out.print("              | No Transaksi		:");
    tr.setNoTransaksi(scanner.nextInt());
    System.out.print("              | Tanggal Transaksi	        :");
    tr.setTglTransaksi(scanner2.nextInt());
    System.out.print("              | Jumlah Beli            :");
    tr.setJmlhBeli(scanner2.nextDouble());
    System.out.println("              ==========================================					 ");
    operation.saveTransaksi(tr);
    System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
    back = scanner2.next().charAt(0);
    if (back == 'V' || back == 'v') {
    	TransaksiView.displaymenuTransaksi();
    }
	}

public static void formUpdateTransaksi() {
	Scanner scanner = new Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in);
	int noTransaksi;
	char back;
	Transaksi tr = new Transaksi();
	TransaksiDAO operation = new TransaksiDAOImpl();
	System.out.println("Masukkan No Transaksi yang akan diupdate : ");
	noTransaksi = scanner.nextInt();
	System.out.println();
	System.out.println("              ===========================================                 ");
    System.out.println("              |       Form Update Data Transaksi        |      ");
    System.out.println("              ===========================================                ");
    System.out.print("              | No Transaksi			  :					|");
    System.out.println(noTransaksi);
    tr.setNoTransaksi(noTransaksi);
    System.out.print("              | Tanggal Transaksi       :					|");
    tr.setTglTransaksi(scanner.nextInt());
    System.out.print("              | Jumlah Beli             :					|");
    tr.setJmlhBeli(scanner2.nextDouble());
            System.out.println("     ============================================");
    operation.updateTransaksi(tr);;
    System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
    back = scanner2.next().charAt(0);
    if (back == 'V' || back == 'v') {
    	TransaksiView.displaymenuTransaksi();
    }
    

}

public static void formDeleteTransaksi() {
	Scanner scanner = new Scanner(System.in);
	int noTransaksi;
	Transaksi tr = new Transaksi();
	TransaksiDAOImpl operation = new TransaksiDAOImpl();
	System.out.println("Masukkan No.Transaksi yang akan dihapus : ");
	noTransaksi = scanner.nextInt();
	tr.setNoTransaksi(noTransaksi);
	operation.deleteTransaksi(tr);
	
}

public static void formSearchTransaksi() {
	Scanner scanner = new Scanner(System.in);
	int noTransaksi;
	Transaksi tr = new Transaksi();
	TransaksiDAO operation = new TransaksiDAOImpl();
	System.out.println("Masukkan No.Transaksi yang akan dicari");
	noTransaksi = scanner.nextInt();
	tr.setNoTransaksi(noTransaksi);
	operation.getTransaksiBynoTransaksi(noTransaksi);
	
}

public static void displayTabelTransaksi(List<Transaksi> allTransaksi) {
	// TODO Auto-generated method stub
	
}


}



