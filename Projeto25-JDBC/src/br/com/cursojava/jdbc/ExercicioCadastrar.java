package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExercicioCadastrar {
	public static void main(String[] args) {
		String cargo;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Entre com o Cargo");
			cargo = sc.nextLine();
			if (cargo.trim().length() > 0) {
				try {
					Connection cn = DriverManager.getConnection(
							"jdbc:mysql://2p3_instrutor:3306/impacta", "aluno",
							"java");

					PreparedStatement ps = cn
							.prepareStatement("INSERT INTO tab_role (role_name) VALUES (?)");

					ps.setString(1, cargo);
					ps.executeUpdate();
					ps.close();
					cn.close();

					System.out.println("Cargo cadastrado com sucesso.");

				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Programa Finalizado.");
			}
		} while (cargo.trim().length() > 0);
		sc.close();
	}

}
