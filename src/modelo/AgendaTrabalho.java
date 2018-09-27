package modelo;
import modelo.Pessoa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AgendaTrabalho {
	List<Pessoa> pessoas = new ArrayList<Pessoa>();

	//Metodo add na Agenda
	public void add(String nome, LocalDate datanascimento, Double altura) {
		Pessoa pessoa = new Pessoa(nome, datanascimento, altura);
		pessoas.add(pessoa);
	}
	
	public void removePessoa(String nomeDaPessoa) {
		Pessoa pessoa = new Pessoa(nomeDaPessoa);
		pessoas.remove(pessoa);
	}
	
	public int buscaPessoa(String nome) {
		Pessoa pessoa = new Pessoa(nome);
		return pessoas.indexOf(pessoa);
	}
	
	public void imprimirAgenda() {
		//System.out.println(pessoas);
		for(Pessoa p:pessoas) {
			System.out.println(p);
		}
	}
	
	public void imprimirPessoa(int index) {
		System.out.println(pessoas.get(index));
	}



}

