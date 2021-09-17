package varejo;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Endereco end1 = new Endereco("bananas","hwdbsd","hsbdjhbs","jshdjnks","njasdklnjksef","knxnwds");
		
		
		end1.setRua ("Rua Seila");
		end1.setCidade("Porto Alegre");
		end1.setBairro("Centro");
		end1.setCep("000");
		
		System.out.println("CLIENTES:");
		
		
		Clientes clie = new Clientes("Kurt kobain","(51)00000-0000","cliente@gmail.com",end1);
		System.out.println("O nome do cliente;"+clie.getNomeCompleto());
		System.out.println("O cliente mora na rua;"+clie.getEndereco().getRua());
		System.out.println("O cliente mora na cidade;"+clie.getEndereco().getCidade());
		System.out.println("O cliente mora no bairro;"+clie.getEndereco().getBairro());
		System.out.println("O cep do cliente;"+clie.getEndereco().getCep());
		System.out.println("O email do cliente;"+clie.getEmail());
		System.out.println("O telefone do cliente;"+clie.getTelefone());	
		
		clie.setEmail("clie@gmail.com");
		clie.setTelefone("(51)00000-0000");
		
		LocalDate hoje = LocalDate.now();
		// Definindo a partir de uma data específica
		LocalDate especifica = LocalDate.of(1991, 9, 6);

		System.out.println("Hoje é Dia:"+hoje.getDayOfMonth());
		System.out.println ("Dia em que nasceu:"+especifica.getDayOfMonth());
		
		int idade = hoje.getYear() - especifica.getYear();
		System.out.println("Ele tem "+idade+" anos");
		
		System.out.println("ESTOQUES:");
	    
	Estoques esto = new Estoques(666,666);
	System.out.println("Quantidade de estoque:"+esto.getQuantidade());
	System.out.println("Valor do estoque:"+esto.getValor());
	
	esto.setQuantidade(666);
	esto.setValor(666);
		
	System.out.println("FORNECEDORES:");
		
	
	Fornecedores forn = new Fornecedores("Atacadão","(51)00000-0000","atacadao@gmail.com","666",000,666,end1);
		System.out.println("O nome do Fornecedor;"+forn.getNomeCompleto());
		System.out.println("O Fornecedor mora na rua;"+forn.getEndereco().getRua());
		System.out.println("O Fornecedor mora na cidade;"+forn.getEndereco().getCidade());
		System.out.println("O Fornecedor mora no bairro;"+forn.getEndereco().getBairro());
		System.out.println("O cep do Fornecedor;"+forn.getEndereco().getCep());
		System.out.println("O email do Fornecedor;"+forn.getEmail());
		System.out.println("O telefone do Fornecedor;"+forn.getTelefone());	
		System.out.println("Os produtos do Fornecedor;"+forn.getProdutos());	
		System.out.println("Os preços do Fornecedor;"+forn.getPreco());
		System.out.println("A quantidade de cada produto do Fornecedor;"+forn.getQuantidade());
		
		
		forn.setEmail("atacadao@gmail.com");
		forn.setTelefone("(51)00000-0000");
		forn.setProdutos("666");
		forn.setPreco(000);
		forn.setQuantidade(666);
		
		System.out.println("PRODUTOS:");
		
	
	Produtos prod = new Produtos("0000","nomes",666,000);
	
	System.out.println("Quantidade de Produto;"+prod.getQuantidade());
	System.out.println("Valor do Produto;"+prod.getPreco());
	System.out.println("Nome do Produto;"+prod.getNome());
	System.out.println("Id do Produto;"+prod.getId());
	
	
	
		prod.setPreco( 00000);
		prod.setQuantidade(000);
		
		System.out.println("TRANSPORTADORA:");
		
	
	Transportadora trans = new Transportadora("Stark","(51)00000-0000","transportadora@gmail.com",end1);
	System.out.println("O nome da transportadora;"+trans.getNome());
	System.out.println("A transportadora fica na rua;"+trans.getEndereco().getRua());
	System.out.println("A transportadora fica na cidade;"+trans.getEndereco().getCidade());
	System.out.println("A transportadora fica no bairro;"+trans.getEndereco().getBairro());
	System.out.println("O cep da transportadora;"+trans.getEndereco().getCep());
	System.out.println("O email da transportadora;"+trans.getEmail());
	System.out.println("O telefone da transportadora;"+trans.getTelefone());	
	
	
	trans.setTelefone("(51)00000-0000");
	trans.setEmail("transportadora@gmail.com");
		
	System.out.println("VENDAS:");
	
	Vendas venda = new Vendas(666,000,"11,09,2001","nome do bagulho");
	
	
	System.out.println("O email do Fornecedor;"+venda.getValor());
	System.out.println("Os produtos do Fornecedor;"+venda.getDataVenda());	
	System.out.println("Os preços do Fornecedor;"+venda.getProduto());
	System.out.println("A quantidade de cada produto do Fornecedor;"+venda.getQuantidade());
		
	
	
	
	System.out.println("VENDEDORES:");
	
	Vendedores vend = new Vendedores("Axel Rose","(51)000000","gunsnroses@gmail.com","$000",end1);
	System.out.println("O nome do Vendedor;"+vend.getNomeCompleto());
	System.out.println("O Vendedor mora na rua;"+vend.getEndereco().getRua());
	System.out.println("O Vendedor mora na cidade;"+vend.getEndereco().getCidade());
	System.out.println("O Vendedor mora no bairro;"+vend.getEndereco().getBairro());
	System.out.println("O cep do Vendedor;"+vend.getEndereco().getCep());
	System.out.println("O email do Vendedor;"+vend.getEmail());
	System.out.println("O telefone do Vendedor;"+vend.getTelefone());	
	System.out.println("O salario do Vendedor;"+vend.getSalario());	
	
		vend.setSalario("vendedor@gmail.com");
		vend.setTelefone("(51)00000-0000");
		
}
	
	
	}
	

