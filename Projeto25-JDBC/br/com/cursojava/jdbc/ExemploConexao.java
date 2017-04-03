package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ExemploConexao {
	public static void main(String[] args) {
		
		try {
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://2p3_instrutor:3306/impacta", "aluno", "java");
			
			System.out.println("Conex�o Aberta");

			cn.close();
			
			System.out.println("Conex�o Fechada");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
