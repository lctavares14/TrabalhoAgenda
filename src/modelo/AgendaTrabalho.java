package modelo;
import modelo.Pessoa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AgendaTrabalho {
ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

//Metodo add na Agenda
public void add(String nome, LocalDate datanascimento, Double altura) {
	Pessoa pessoa = new Pessoa(nome, datanascimento, altura);
	pessoa.setNome(nome);
	pessoa.setDatanascimento(datanascimento);
	pessoa.setAltura(altura);
	pessoas.add(pessoa);
	}

public void removePessoa(String nomeDaPessoa) {
	pessoas.remove(get(nomeDaPessoa));
}

public void buscaPessoa() {
	
}

public void imprimirAgenda() {
	System.out.println(pessoas);
	});
}

public void imprimirPessoa() {
	
}



}

