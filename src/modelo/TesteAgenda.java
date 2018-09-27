package modelo;

import java.time.LocalDate;

public class TesteAgenda {
public static void main(String[] args) {
	
	AgendaTrabalho agenda = new AgendaTrabalho();
	
	System.out.println("Iniciando processo...");
	agenda.add("Lucas",LocalDate.of(1995, 8, 4), Double.valueOf("1.89"));
	agenda.add("Jeovan",LocalDate.of(1986, 7, 18), Double.valueOf("1.89"));
	agenda.add("Juan",LocalDate.of(1978, 9, 6), Double.valueOf("1.89"));
	agenda.add("Marcelo",LocalDate.of(1980, 6, 9), Double.valueOf("1.89"));

	System.out.println("Removendo...");
	agenda.removePessoa("Marcelo");
	
	System.out.println("Imprimindo...");
	agenda.imprimirAgenda();
	
	System.out.println("Imprimindo...");
	agenda.imprimirPessoa();




}
}
