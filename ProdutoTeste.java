package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		double valorDescontado = p1.preco * p1.desconto;
		double valorFinal1 = p1.precoComDesconto();
	
		
		
		System.out.println("Preço original do produto " + p1.nome + " é : " + p1.preco );
		System.out.println("O desconto final do produto " + p1.nome + " é : " + valorDescontado );
		System.out.printf("Valor Final: R$%.2f \n", p1.precoComDesconto());
		System.out.printf("Valor Final: R$%.2f", valorFinal1);
	}
}
