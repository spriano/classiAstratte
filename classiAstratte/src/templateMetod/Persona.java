package templateMetod;

public class Persona {
	private String nome;

	public Persona(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return " " + nome;
	}

}
