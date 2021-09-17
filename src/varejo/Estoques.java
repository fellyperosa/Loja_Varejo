package varejo;

public class Estoques {
	
	private Integer quantidade;
	private Integer valor;
	
	
	
	public Estoques(Integer quantidade,Integer valor) {
		this.quantidade = quantidade;
		this.valor = valor;
	
	}
	// Getters
	public Integer getQuantidade() {
		return this.quantidade;
	}
	public Integer getValor() {
		return this.valor;
	}
	
	
		
	
	

	// Setters
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
	return String.format("Estocado : %q. Valor: %s",this.quantidade,this.valor);

	}

}