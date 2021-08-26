package Atividades;

public class TesteCavalo {

	public static void main(String[] args) {
		
		Cavalo Appaloosa = new Cavalo("Gerson",15,"Loira",4,4);
		
		Appaloosa.imprimirInfo();
		Appaloosa.sons();//poliformismo
		Appaloosa.correr();
	}
}
