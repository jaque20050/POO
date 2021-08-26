package Atividades;

public class Cachorro extends Animal {//extends = herdando da superclasse Pessoa
	
	private int patas;
	private int registro;
	private int carteiraVacinas;
	
	
	public Cachorro(String nome, int idade,int patas,int registro,int carteiraVacinas){
		
		super(nome,idade);
		this.patas = patas;
		this.registro = registro;
		this.carteiraVacinas = carteiraVacinas;
	}
	//GET = Obter valores
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public void imprimirInfo() {
		System.out.println("*************** Dados do Animal *****************");
		System.out.println("Nome do Animal: "+getNome()+"\n"+"Idade do Animal: "+getIdade()+"\n"+"Quantidade de Patas: "+patas+
				"\n"+"RGA do Animal: "+registro+"\n"+"Carteira de Vacinação: "+carteiraVacinas);//Irá mostrar os dados do Animal
	}
	@Override
	public void sons(){
		System.out.println("AUAU....AUAU....");
	}
	@Override
	public void correr(){
		System.out.println("Correndo...");
	}
}
