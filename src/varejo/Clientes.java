package varejo;

import java.time.LocalDate;

public class Clientes {
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private String email;
	private String telefone;
	
	public Clientes(String nomeCompleto,String telefone,String email,Endereco endereco) {
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.nomeCompleto =nomeCompleto;
		
	}
	// Getters
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public String getEmail() {
		return this.email;
		
	}
	public String getTelefone() {
		return this.telefone;
	}
	

	// Setters
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		// Nome e nascimento nao mudam...
		
		
	}
	@Override
	public String toString() {
	return String.format(" %n %d. %e Contato: -%e %t/.",this.nomeCompleto,this.dataNascimento,this.endereco,this.email,this.telefone);
	
	}
	
}

