package org.itenas.oop.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSetMetaData;


import org.itenas.oop.DAO.BarangATKDAO;
import org.itenas.oop.bean.BarangATK;
import org.itenas.oop.utils.DatabaseUtil;


public class BarangATKDAOimpl implements BarangATKDAO {

	@Override 
	public BarangATK getbarangatkbyidbarang(int idbarang){
		return null;
	}

	@Override
	public void getbarangatkbynamabarang(String namabarang) {
		DatabaseUtil db = new DatabaseUtil();
		BarangATK barangAtk = new BarangATK();
		try {
			db.connect();
			
			String query = "SELECT * FROM barang WHERE nama_barang = '"+namabarang+"'";
			ResultSet rs = db.readData(query);
			
			if (rs.next()) {
				
				ResultSetMetaData metaData = rs.getMetaData();
				int jumlahkolom = metaData.getColumnCount();
				do {
					for (int i = 1; i <= jumlahkolom; i++) {
						barangAtk.setIdbarang(Integer.parseInt(rs.getObject(1).toString()));
						barangAtk.setNamabarang(rs.getObject(2).toString());
						barangAtk.setMerekbarang(rs.getObject(3).toString());
						barangAtk.setHargabarang(Double.parseDouble(rs.getObject(4).toString()));
						barangAtk.setJumlahbarang(Integer.parseInt(rs.getObject(5).toString()));
												
					}
				} while (rs.next());
			} else {
				barangAtk.setIdbarang(0);
			}
			
			db.disconnect();
		} catch (SQLException ex) {
			System.out.println("The following error has occured : "+ex.getMessage());
		}
		
		org.itenas.oop.views.TableView.displayTupleBarangATK(barangAtk);
		
	}


	@Override
	public BarangATK getbarangatkbymerekbarang(String merekbarang) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BarangATK> getAllBarangatk() {
		List<BarangATK> listBarangATK = new ArrayList<BarangATK>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			
			String query = "SELECT * FROM barang";
			
			ResultSet rs = db.readData(query);
			
			while (rs.next()) {
				
				org.itenas.oop.bean.BarangATK barangAtk = new BarangATK();
				
				barangAtk.setIdbarang(Integer.parseInt(rs.getObject(1).toString()));
				barangAtk.setNamabarang(rs.getObject(2).toString());
				barangAtk.setMerekbarang(rs.getObject(3).toString());
				barangAtk.setHargabarang(Double.parseDouble(rs.getObject(4).toString()));
				barangAtk.setJumlahbarang(Integer.parseInt(rs.getObject(5).toString()));
				
				listBarangATK.add(barangAtk);
			}
			db.disconnect();
		
		} catch (SQLException ex) {
			System.out.println("Terjadi error : "+ex.getMessage());
		}
		
		return listBarangATK;
	}
	
	@Override
	public void saveBarangatk(BarangATK barangatk) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO barang (id_barang, nama_barang, merek_barang, harga_barang, jumlah_barang)"
					+ "VALUES ("+barangatk.getIdbarang()+", '"
					+ barangatk.getNamabarang()+"', '"
					+ barangatk.getMerekbarang()+"',"
					+ barangatk.getHargabarang()+", "
					+ barangatk.getJumlahbarang()+")";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan");
		} catch(Exception ex) {
			System.out.println("Terjadi error : "+ex.getMessage());
		}
		
	}
	
	@Override
	public void updateBarangatk(BarangATK barangatk) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE barang SET id_barang='"+barangatk.getIdbarang()+"',"
			+ "merek_barang='"+barangatk.getMerekbarang()+"',"
			+ "harga_barang="+barangatk.getHargabarang()+","
			+ "jumlah_barang="+barangatk.getJumlahbarang()+" WHERE nama_barang='"+barangatk.getNamabarang()+"'";
		
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui !");
		} catch (Exception e) {
			System.out.println("Terjadi error : "+e.getMessage());
		}
		
	}

	@Override
	public void deleteBarangatk(BarangATK barangatk) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM barang where nama_barang='"+barangatk.getNamabarang()+"'";
			db.executeQuery(query);
			org.itenas.oop.views.TableView.displayBarangATK(getAllBarangatk());
		} catch (Exception e) {
			System.out.println("Terjadi Error : "+e.getMessage());
		}
		
	}
	
	
}