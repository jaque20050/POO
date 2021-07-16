package Atividades;

public class Cavalo extends Animal{
	
	private String crina;
	private int casco;
	private int ferradura;
	
	public Cavalo(String nome,int idade, String crina,int casco,int ferradura) {
		
		super(nome,idade);
		this.crina = crina;
		this.casco = casco;
		this.ferradura = ferradura;
	}
	//GET = Obter valores
	public String getCrina() {
		return crina;
	}
	public void setCrina(String crina) {
		this.crina = crina;
	}
	public int getCasco() {
		return casco;
	}
	public void setCasco(int casco) {
		this.casco = casco;
	}
	public int getFerradurra() {
		return ferradura;
	}
	public void setFerradurra(int ferradurra) {
		this.ferradura = ferradurra;
	}
	public void imprimirInfo() {
		System.out.println("*************** Dados do Animal *****************");
		System.out.println("Nome do Animal: "+getNome()+"\n"+"Idade do Animal: "+getIdade()+"\n"+"Cor da Crinas: "+crina+
				"\n"+"Quantidade de Cascos: "+casco+"\n"+"Quantidade de Ferradura: "+ferradura);//Irá mostrar os dados do Animal
	}
	@Override
	public void sons(){
		System.out.println("TROT....TROT....");
	}
	@Override
	public void correr(){
		System.out.println("Cavalgando...");
	}
	
}
