package Model;

import java.util.Map;

public class Receita {
	private Map<Ingrediente, Double> ingredientes;
	private String instrucoes;

	public Receita(Map<Ingrediente, Double> ingredientes, String instrucoes) {
		this.ingredientes = ingredientes;
		this.instrucoes = instrucoes;
	}

	public Map<Ingrediente, Double> getIngredientes() {
		return ingredientes;
	}

	public String getInstrucoes() {
		return instrucoes;
	}
}
