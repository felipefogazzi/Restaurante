package Model;

import java.util.Map;

public class Item {


	private double custo;
	private double preco;
	private double tempo;

	private Receita receita;
	private CategoriaItem categoria;

	public Item(double preco, double custo, double tempo, CategoriaItem categoria, Receita receita) {
		this.preco = preco;
		this.custo = custo;
		this.tempo = tempo;
		this.receita = receita;
		this.categoria = categoria;
	}

	public CategoriaItem getCategoria() {
		return categoria;
	}
	
	public Map<Ingrediente, Double> getIngredientes(){
		return receita.getIngredientes();
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getTempo() {
		return tempo;
	}
	
	public double getCusto() {
		return custo;
	}
}
