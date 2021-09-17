package varejo;

import java.time.LocalDate;

public class Produtos {
	private String id;
	private String nome;
	private LocalDate dataVencimento;
	private Integer preco;
	private Integer quantidade;
	
	public Produtos(String id,String nome,Integer preco,Integer quantidade) {
		
		
		
		this.id = id;
		this.nome = nome;
		
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	// Getters
	public String getId() {
		return this.id;
	}
	public String getNome() {
		return this.nome;
	}
	public LocalDate getDataVencimento() {
		return this.dataVencimento;
	}
	public Integer getPreco() {
		return this.preco;
		
	}
	public Integer getQuantidade() {
		return this.quantidade;
	}
	

	// Setters
	
	
	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
	return String.format(" %i %n %v/.produtosEspecifi: %p %q",this.id,this.nome,this.dataVencimento,this.preco,this.quantidade);
	}

}