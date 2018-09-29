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
		pessoas.add(pessoa);//Adicionar na lista
		//localDate idadeEmAnos = LocalDate.now().plusYears(-idade);
		//Pessoa pessoa = new pessoa();
		//pessoa.setNascimento(idadeEmAnos
		//pessoa.setAltura(altura);
		//pessoa.setNome(nome);
		//pessoas.add(pessoa);
	}
	//Remover Pessoa
	public void removePessoa(String nomeDaPessoa) {
		Pessoa pessoa = new Pessoa(nomeDaPessoa);
		pessoas.remove(pessoa);
	}
	//Busca uma pessoa na lista
	public int buscaPessoa(String nome) {
		Pessoa pessoa = new Pessoa(nome);
		return pessoas.indexOf(pessoa);
		
		//Pessoa pessoa = new Pessoa();
		//Pessoa.setNome(nome);
		//Integer index = pessoas.indexof(pessoa);
		//returnindex;
	}
	//Imprimir Angenda
	public void imprimirAgenda() {
		//System.out.println(pessoas);
		for(Pessoa p:pessoas) {
			System.out.println(p);
		}
	}
	//Imprimir uma Pessoa da Agenda
	public void imprimirPessoa(int index) {
		System.out.println(pessoas.get(index));
	}
}

