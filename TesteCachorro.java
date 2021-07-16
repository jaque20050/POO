package Atividades;

public class TesteCachorro {

	public static void main(String[] args) {
		
		Cachorro Dalmata = new Cachorro("Brilinho",6,4,90833,997645);
		
		Dalmata.imprimirInfo();
		Dalmata.sons();//poliformismo
		Dalmata.correr();
	}
}
