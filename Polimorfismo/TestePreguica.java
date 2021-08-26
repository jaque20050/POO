package Atividades;

public class TestePreguica {

	public static void main(String[] args) {
		
		Preguica Real = new Preguica("Robertinho",15,"Áspera",12,"Alface");
		
		Real.imprimirInfo();
		Real.sons();//poliformismo
		Real.correr();
	}

}
