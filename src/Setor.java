import java.util.*;

public class Setor {
	
	private String nome;
	
	public List<Mesa> mesa;
	
	public Setor(String _nome) {
		nome = _nome;
		mesa = new ArrayList<Mesa>();
	}
	
	public String getNome() {
		return nome;
	}
}