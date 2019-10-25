package iesserpis.ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PruebaMySql {
	private static Connection connection;

	public static void main(String[] args) throws SQLException {
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost/dbprueba?serverTimezone=UTC", "root", "sistemas");
		
		showAll();
		
		connection.close();
		

	}
	
	private static void showAll() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from categoria order by id");
		
		while (resultset.next()) {
			System.out.printf("id=%s %n",resultset.getObject("id"),resultset.getObject("nombre"));
									
		}
		statement.close();
		
		
	}
	private static void insert() throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("insert into categoria(nombre) values(?)");
		preparedStatement.setObject(1, "cat4");
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}

}
