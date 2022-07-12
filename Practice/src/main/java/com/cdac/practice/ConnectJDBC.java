package com.cdac.practice;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConnectJDBC")
public class ConnectJDBC extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = 1;
		String firstName = "Aniket";
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/latur", "root", "cdac");
			//Statement stmt1 = conn.createStatement();
			PreparedStatement rs = conn.prepareStatement("insert into employee1 (id, firstName) values (?, ?)");
			rs.setInt(1, id);
			rs.setString(2, firstName);
			rs.executeUpdate();
			System.out.println("Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); }
			catch(Exception e) {}
		}
	}
}

