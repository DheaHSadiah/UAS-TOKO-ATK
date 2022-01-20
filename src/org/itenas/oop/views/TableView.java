package org.itenas.oop.views;

import java.util.List;
import java.util.Scanner;

import org.itenas.oop.DAO.BarangATKDAO;
import org.itenas.oop.DAO.TransaksiDAO;
import org.itenas.oop.DAOImpl.BarangATKDAOimpl;
import org.itenas.oop.DAOImpl.TransaksiDAOImpl;
import org.itenas.oop.bean.BarangATK;
import org.itenas.oop.bean.Transaksi;
import org.itenas.oop.jdbc.bean.KaryawanTetap;
import org.itenas.oop.jdbc.dao.KaryawanTetapDAO;
import org.itenas.oop.jdbc.daoimpl.KaryawanTetapDAOImpl;
import org.itenas.oop.jdbc.views.KaryawanTetapView;

public class TableView {
	public static void main(String[] args) {
		BarangATKDAO operation = new BarangATKDAOimpl();
		displayBarangATK(operation.getAllBarangatk());
	}
	
	public static void displayBarangATK(List<BarangATK> listBarangATK) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA Barang ATK				     |");
		System.out.println("     ------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID Barang\t\t|\tNama Barang\t|       Merek Barang     |       Harga Barang   |          Jumlah Barang   |");
		System.out.println("     ------------------------------------------------------------------------------------------------------------------------------------");
		for (BarangATK bATK : listBarangATK) {
			System.out.println("    |\t"+bATK.getIdbarang()+"\t               |         "+bATK.getNamabarang()+"\t         |          "+bATK.getMerekbarang()+"\t      |    "+bATK.getHargabarang()+"\t       |          "+bATK.getJumlahbarang()+"    |");
		}
		System.out.println("     ------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
	}
	
	public static void displayTupleBarangATK(BarangATK barangAtk) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA Barang ATK			|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |ID Barang\t\t: " + barangAtk.getIdbarang()+"\t\t\t\t|");
		System.out.println("    |Nama Barang\t\t: " + barangAtk.getNamabarang()+"\t\t\t|");
		System.out.println("    |Merek Barang\t\t: " + barangAtk.getMerekbarang()+"\t\t|");
		System.out.println("    |Harga Barang\t\t: " + barangAtk.getHargabarang()+"\t\t\t\t|");
		System.out.println("    |Jumlah Barang\t\t: " + barangAtk.getJumlahbarang()+"\t\t\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
	}


	public static void main1(String[] args) {
		TransaksiDAO operation = new TransaksiDAOImpl();
		displayTabelTransaksi(operation.getAllTransaksi());
	}
	
	public static void displayTabelTransaksi(List<Transaksi> listTransaksi) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA TRANSAKSI					    		 |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tNo Transaksi\t\t|\tTanggal Transaksi\t\t\t|       Jumlah Beli      			 |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Transaksi Tr : listTransaksi) {
			System.out.println("    |\t"+Tr.getNoTransaksi()+"\t|       "+Tr.getTglTransaksi()+"\t        |       "+Tr.getJmlhBeli()+"\t|");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [V] Tekan Tombol V untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'V' || back == 'b') {
			TransaksiView.displayMenuTransakai();
		}
	}
	
	public static void displayTupleTransaksi(Transaksi transaksi) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA TRANSAKSI				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |No Transaksi\t\t: " + transaksi.getNoTransaksi()+"\t\t\t\t|");
		System.out.println("    |Tanggal Transaksi\t\t: " + transaksi.getTglTransaksi()+"\t\t\t|");
		System.out.println("    |Jumlah Beli\t\t: " + transaksi.getJmlhBeli()+"\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [V] Tekan Tombol V untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'V' || back == 'v') {
			TransaksiView.displayMenuTransaksi();
		}
	}	
	
}
