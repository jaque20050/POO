package Atividades;

public class Preguica extends Animal {
	
	private String pelagem;
	private int unhas;
	private String comida;
	
	public Preguica(String nome,int idade,String pelagem,int unhas,String comida) {
		
		super(nome,idade);
		this.pelagem = pelagem;
		this.unhas = unhas;
		this.comida = comida;
	}
	//GET = Obter valores
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public int getUnhas() {
		return unhas;
	}
	public void setUnhas(int unhas) {
		this.unhas = unhas;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public void imprimirInfo() {
		System.out.println("*************** Dados do Animal *****************");
		System.out.println("Nome do Animal: "+getNome()+"\n"+"Idade do Animal: "+getIdade()+"\n"+"Tipos de Pelagem: "+pelagem+
				"\n"+"Quantidade de Unhas: "+unhas+"\n"+"Comida Favorita: "+comida);//Irá mostrar os dados do Animal
	}
	@Override
	public void sons(){
		System.out.println("Crack....Crack....");
	}
	@Override
	public void correr(){
		System.out.println("Subindo em Arvores...");
	}
}
