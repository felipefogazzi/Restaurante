package Model;
public class Mesa {
	
	private Setor setor;
	private int capacidade;
	
	public Mesa(int _capacidade, Setor _setor) {
		capacidade = _capacidade;
		setor = _setor;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public Setor getSetor() {
		return setor;
	}
}
