package varejo;

public class Fornecedores {
	private String nomeCompleto;
	private Endereco endereco;
	private String telefone;
	private String email;
	private String produtos;
	private Integer preco;
	private Integer quantidade;
	
	public Fornecedores(String nomeCompleto,String telefone,String email,String produtos,Integer preco,Integer quantidade, Endereco endereco) {    
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
		this.email = email;
		this.produtos = produtos;
		this.preco = preco;
		this.quantidade = quantidade;
		this.endereco = endereco;
		
	}
	
	// Getters
	public String getNomeCompleto() {
		return this.nomeCompleto;
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
	public String getProdutos() {
		return this.produtos;
	}
	public Integer getPreco() {
		return this.preco;
	}
	public Integer getQuantidade() {
		return this.quantidade;
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
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	

	}
	@Override
	public String toString() {
	return String.format(" %n %e. Contato: %t -%e/. Produtos: %p -%p%q",this.nomeCompleto,this.endereco,this.telefone,this.email,this.produtos,this.preco,this.quantidade);

}
}



