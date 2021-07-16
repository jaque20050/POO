package Atividades;

public abstract class Animal{ //Herança = Mãe = Superclasse
	//Para que o Polimorfismo aconteça, acrescenta ABSTRACT
	
	//Caracteristicas = Atributos\\
	private String nome;//Irá distribuir esse atributo em outras subclasses
	private int idade;

	//Private = somente metodos da minha classe pessoa pode acessar
	
    //Construtor\\//Inicializar os meus atributos\\
	public Animal(String nome,int idade) {
		super();//Super e da superclasse = atributos inicializados são da superclasse
		this.nome = nome;//THIS = Para diferenciar meu atributo do parametro
		this.idade = idade;//Passar parametro para atributo
	}
	//GET = Obter valores/
	public String getNome() {
		return nome;
	}
	//SET = Atribuir valores
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
    }
	abstract public void sons();// E necessario criar um abstract na SuperClase, para que todos herdam dele, 
	//somente a caracteristicas são diferentes
	abstract public void correr();
}
