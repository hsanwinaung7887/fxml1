package hmi.model;

import java.awt.TextField;
import java.sql.Connection;
import java.sql.SQLException;

import application2.DBConnection;
import javafx.fxml.FXML;

public class LoginDAO {
	public static void checkCredetial (String name, String email, String phone, String dob, String address) throws SQLException {
		Connection con = DBConnection.connect();
		if(con!=null)
		{
			System.out.println("Connection Successfully.");
			System.out.println(name);
			System.out.println(email);
			System.out.println(phone);
			System.out.println(dob);
			System.out.println(address);
			
		}

	}
}

