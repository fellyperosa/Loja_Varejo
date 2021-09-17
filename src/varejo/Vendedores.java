package varejo;

import java.time.LocalDate;

public class Vendedores {
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private String salario;
	private String telefone;
	private String email;
	
	public Vendedores(String nomeCompleto,String telefone,String email,String salario,Endereco endereco) {
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.nomeCompleto =nomeCompleto;
		this.salario = salario;
		

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
	public String getSalario() {
		return this.salario;
		
	}
	public String getTelefone() {
		return this.telefone;
	}
	

	// Setters
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	

	}
	@Override
	public String toString() {
	return String.format(" %n %d. %e %s Contato: %t -%e/.",this.nomeCompleto,this.dataNascimento,this.endereco,this.salario,this.telefone,this.email);
}
}
