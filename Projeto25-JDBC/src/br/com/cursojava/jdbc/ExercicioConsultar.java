package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExercicioConsultar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pnome, nome = null;
		Float salario = null;
		try {
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://2p3_instrutor:3306/impacta", "aluno", "java");

			System.out.print("Entre com um nome ou pedaço de um nome: ");
			pnome = sc.nextLine();
			System.out.println();

			if (pnome.trim().length() > 0) {

				PreparedStatement ps = cn
						.prepareStatement("SELECT func_name, func_rmnt_val FROM tab_func WHERE func_name LIKE ?");

				ps.setString(1, "%" + pnome + "%");

				ResultSet rs = ps.executeQuery();
				System.out.printf("Nome" + "\t\t    " + "Salario");
				System.out.println();
				while (rs.next()) {
					nome = rs.getString("func_name");
					salario = rs.getFloat("func_rmnt_val");
					System.out.printf("%-20s%,.2f \n", nome, salario);
				}
				System.out.println();
				System.out.println("Consulta Realizada");
				ps.close();
				cn.close();
				rs.close();
			} else {
				System.out
						.println("Nenhuma nome foi colocado, finalizando programa");
				cn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();

	}
}
