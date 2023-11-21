import java.io.Serializable;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private transient String nome;
	private int cpf;
	
	public Pessoa(String nome, int cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) throws IllegalArgumentException{
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
 		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
	
		return getNome() + " " + getCpf();
	}
}
