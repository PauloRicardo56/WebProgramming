package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import br.com.bean.CarBean;


public class CarDAO {
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	
	public CarDAO() {
		conn = new ConnectionFactory().getConnection();
	}
	
	// Insert a new car on database
	public boolean insertCar(CarBean car) {
		String sql = ""
				+ "INSERT INTO car (fabricante,modelo,ano,disponivel)"
				+ "values(?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, car.getFabricante());
			ps.setString(2, car.getModelo());
			ps.setString(3, Integer.toString(car.getAno()));
			ps.setString(4, Integer.toString(car.getDisponivel()));
			ps.execute();
			ps.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// Get all cars on database
	public ArrayList<CarBean> selectCar() {
		ArrayList<CarBean> cars = new ArrayList<CarBean>();
		String sql = "SELECT * FROM car";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				cars.add(new CarBean(
							rs.getString("fabricante"),
							rs.getString("modelo"),
							rs.getInt("ano"),
							rs.getBoolean("disponivel"),
							rs.getString("id_car"))
						);
			}
			return cars;
		} catch (Exception e) {
			return null;
		}
	}
	
	// Get a car by its id on database.
	public CarBean selectCar(String id) {
		CarBean car;
		String sql = "SELECT * FROM car WHERE id_car = " + id;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				car = new CarBean(
						rs.getString("fabricante"),
						rs.getString("modelo"),
						rs.getInt("ano"),
						rs.getBoolean("disponivel"),
						rs.getString("id_car"));
				return car;
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}
	
	// Get a car by its model on database.
	public CarBean selectCarByModel(String modelo) {
		CarBean car;
		String sql = "SELECT * FROM car WHERE modelo = \"" + modelo + "\"";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				car = new CarBean(
						rs.getString("fabricante"),
						rs.getString("modelo"),
						rs.getInt("ano"),
						rs.getBoolean("disponivel"),
						rs.getString("id_car"));
				return car;
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}
	
	// type = 0 for rent; type = 1 for return.
	public boolean updateCar(String id, String type) {
		String sql = "UPDATE car SET disponivel = \"" + type + "\" WHERE id_car = " + id;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateCar(String id, String f, String m, String a) {
		String sql = 
				"UPDATE car "
				+ "SET fabricante = \"" + f + "\""
				+ ", modelo = \"" + m + "\""
				+ ", ano = \"" + a + "\""
				+ " WHERE id_car = " + id;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean removeCar(String id) {
		String sql = "DELETE FROM car WHERE id_car = " + id;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
