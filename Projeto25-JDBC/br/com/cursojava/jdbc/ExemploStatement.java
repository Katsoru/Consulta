package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploStatement {
	public static void main(String[] args) {

		try {
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://2p3_instrutor:3306/impacta", "aluno", "java");

			Statement st = cn.createStatement();

			st.executeUpdate("INSERT INTO tab_role (role_name) VALUES ('Padeiro')");

			
			st.close();
			cn.close();

			System.out.println("Dados inseridos com sucesso.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
