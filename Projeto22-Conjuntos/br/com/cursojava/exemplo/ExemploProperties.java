package br.com.cursojava.exemplo;

import java.io.IOException;
import java.util.Properties;

public class ExemploProperties {

	public static void main(String[] args) {
		
		
		try {
			Properties props = new Properties();
			props.load(ExemploProperties.class.getResourceAsStream("/resources/exemplo.properties"));
			System.out.printf("O usuário acessou %s vezes", props.get("qtd.acesso"));
//			String acessos = props.getProperty("qtd.acesso");
		} catch (IOException e) {
			System.out.println("Falha ao carregas as configurações.");
			e.printStackTrace();
		}
	}
}
