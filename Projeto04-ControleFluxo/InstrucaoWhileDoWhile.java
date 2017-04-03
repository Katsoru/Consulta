
public class InstrucaoWhileDoWhile {
public static void main(String[] args) {
	int i=0;
	while (i<100) {
		System.out.println("Dentro do While");
		i+=3;
	}
	i=0;
	do {
		System.out.println("Dentro do Do While 2");
		i+=3;
	} while (i<100);
}
}
