import java.util.*;
import java.io.*;

public class Database {
	
	private List<Turno> turno;
	private List<Funcionario> funcionario;
	private List<Setor> setor;
	
	public Database() {
		turno = new ArrayList<Turno>();
		funcionario = new ArrayList<Funcionario>();
		setor = new ArrayList<Setor>();
	}
	
	public void CarregarMesas(String caminho) throws IOException {

        Scanner leitor = null;
        
        int totalSetores = 0;
        int setorAtual = 0;
        int totalMesas = 0;
        int mesaAtual = 0;
        Setor setorAux = new Setor("teste");
        Mesa mesaAux = new Mesa(0,setorAux);
        
        try {
        	leitor = new Scanner(new BufferedReader(new FileReader(caminho)));

            while (leitor.hasNext()) {
            	String aux = leitor.next();
            	if(aux.equals("#")) {
            		leitor.nextLine();
            		aux = leitor.next();
            	}
            	
            	if(totalSetores == 0) {
            		totalSetores = Integer.parseInt(aux);
            		setorAtual = 1;
            		System.out.println("totalSetores : " + totalSetores);
            	}
            	else if(totalMesas == 0 && setorAtual <= totalSetores) {
            		String nomeSetor = new String(aux);
            		aux = leitor.next();
            		totalMesas = Integer.parseInt(aux);
            		mesaAtual = 1;
            		setorAux = new Setor(nomeSetor);
            		setor.add(setorAux);
            		System.out.println("Setor : " + nomeSetor + " Mesas : " + totalMesas);
            	}
            	else if(mesaAtual <= totalMesas) {
            		mesaAtual++;
            		if(mesaAtual > totalMesas) {
                		totalMesas = 0;
                		setorAtual++;
            		}
            		mesaAux = new Mesa(Integer.parseInt(aux),setorAux);
            		setorAux.mesa.add(mesaAux);
            		System.out.println("Mesa : " + aux);
            	}
            }
        } finally {
            if (leitor != null) {
            	leitor.close();
            }
        }
        //
	}
	
	public void CarregarFuncionarios() {
		
	}
}
