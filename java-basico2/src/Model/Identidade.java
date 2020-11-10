package Model;

public class Identidade {

	private String nome;


	
	public void apresentacao() {
		System.out.print("Eu sou um: ");
	}
	
	public Identidade (String nome) {
		this.nome=nome;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
