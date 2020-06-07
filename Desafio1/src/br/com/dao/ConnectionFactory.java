package br.com.dao;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionFactory {
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/desafio_concesionaria";
		String user = "root";
		String password = "12345678";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException(e.getLocalizedMessage());
		}
	}
}
