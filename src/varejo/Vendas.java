package varejo;



public class Vendas {
	private Integer valor;
	private Integer quantidade;
	private String dataVenda;
	private String produto;
	
	public Vendas(Integer valor, Integer quantidade, String dataVenda, String produto) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.dataVenda = dataVenda;
		this.produto = produto;
		
	}
	// Getters
	public Integer getValor() {
		return this.valor;
	}
	public Integer getQuantidade() {
		return this.quantidade;
	}
	public String getDataVenda() {
		return this.dataVenda;
	}
	public String getProduto() {
		return this.produto;
		
	}
	//Valor, quantidade, data da venda e o produto que vendi nao pode mudar!!!
	
	@Override
	public String toString() {
	return String.format(" %d/.produtos:%v %q %p ",this.dataVenda,this.valor,this.quantidade,this.produto);
}
	
}
	