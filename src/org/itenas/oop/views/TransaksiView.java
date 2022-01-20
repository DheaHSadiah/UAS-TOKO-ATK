package org.itenas.oop.views;

import java.util.Scanner;

import org.itenas.oop.DAO.BarangATKDAO;
import org.itenas.oop.DAO.TransaksiDAO;
import org.itenas.oop.DAOImpl.BarangATKDAOimpl;
import org.itenas.oop.DAOImpl.TransaksiDAOImpl;

public class TransaksiView {
	
	public TransaksiView() {
		
	}
		public static void displaymenuTransaksi() {
			int menu;
			Scanner scanner = new Scanner(System.in);
			TransaksiDAO operation = new TransaksiDAOImpl();
			System.out.println();			        
	        System.out.println("              ===================================================                 ");
	        System.out.println("              |            		Data Transaksi    				 |                  ");
	        System.out.println("              ====================================================                  ");
	        System.out.println("              | Pilihan:                              			 |                  ");
	        System.out.println("              |        1. Input Data Transaksi		  		     |  				 ");
	        System.out.println("              |        2. Cari Data Transaksi By No transaksi    |                  ");
	        System.out.println("              |        3. Tampilkan Seluruh Data Transaksi 	     |                  ");
	        System.out.println("              |        4. Perbarui Data Transaksi             	 |                  ");
	        System.out.println("              |        5. Hapus Data Transaksi                	 |                  ");
	        System.out.println("              |        6. Kembali                   	    	 |                 ");
	        System.out.println("              ====================================================                  ");	
	        System.out.println();
	        System.out.print("Pilih menu: ");
	        menu = scanner.nextInt();
	        
	        while (!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6)) {
	        	System.out.println("Menu yang Anda masukkan salah!");
	        	System.out.println("Silahkan pilih menu kembali :");
	        	menu = scanner.nextInt();
	        }
	        
	        switch (menu) {
	        	
	        case 1:
	        	FormView.formInsertTransaksi();
	        	break;
	        case 2:
	        	FormView.formSearchTransaksi();
	        	break;
	        case 3:
	        	FormView.displayTabelTransaksi(operation.getAllTransaksi());
	        	break;
	        case 4:
	        	FormView.formUpdateTransaksi();
	        	break;
	        case 5:
	        	FormView.formDeleteTransaksi();
	        	break;
	        case 6:
	        	//
	        }
	        
	        scanner.close();
	}
}
