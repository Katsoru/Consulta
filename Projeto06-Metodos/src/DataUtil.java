public class DataUtil {
	public static void main(String[] args) {
		exibeSaudacao(8);
	}
	
	static void exibeSaudacao(int horas){
		if(horas>=4 && horas <12){
			System.out.println("Bom dia! Agora s�o: " + horas + " Horas");
		} else if(horas>=12 && horas<20){
			System.out.println("Boa tarde! Agora s�o: " + horas + " Horas");
		} else if(horas>=20 && horas<=24 || horas>=0 && horas<4 ){
			System.out.println("Boa noite! Agora s�o: " + horas + " Horas");
		} else {
			System.out.println("As horas est�o incorretas");
		}
		
	}
}
