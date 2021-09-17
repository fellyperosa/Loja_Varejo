package varejo;

public class Transportadora {
	private String nome;
	private  Endereco endereco;
	private String telefone;
	private String email;
	
	public Transportadora(String nome,String telefone,String email,Endereco endereco) {
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.nome =nome;
	}
	
	
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public String getEmail() {
		return this.email;
		
	}
	

	// Setters
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;

	}
	@Override
	public String toString() {
	return String.format(" %n %e/.contato: %t -%e",this.nome,this.endereco,this.telefone,this.email);
}
}
