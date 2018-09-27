package modelo;

import java.time.LocalDate;

public class TesteAgenda {
public static void main(String[] args) {
	
	AgendaTrabalho agenda = new AgendaTrabalho();
	
	System.out.println("Iniciando processo...");
	agenda.add("Lucas",LocalDate.of(1995, 8, 4), Double.valueOf("1.83"));
	agenda.add("Jeovan",LocalDate.of(1986, 7, 18), Double.valueOf("1.80"));
	agenda.add("Juan",LocalDate.of(1978, 9, 6), Double.valueOf("1.59"));
	agenda.add("Marcelo",LocalDate.of(1980, 6, 9), Double.valueOf("1.63"));
	agenda.add("Joao",LocalDate.of(1990, 8, 12), Double.valueOf("1.48"));
	agenda.add("Marcio",LocalDate.of(2002, 10, 8), Double.valueOf("1.58"));
	agenda.add("Eduardo",LocalDate.of(2001, 11, 24), Double.valueOf("1.65"));
	agenda.add("Matheus",LocalDate.of(2000, 1, 1), Double.valueOf("1.57"));
	agenda.add("Rafael",LocalDate.of(1998, 2, 3), Double.valueOf("1.78"));
	agenda.add("Alex",LocalDate.of(1960, 3, 11), Double.valueOf("1.79"));
	
	System.out.println("Imprimindo...");
	agenda.imprimirAgenda();
	
	System.out.println("Removendo...");
	agenda.removePessoa("Marcelo");
	
	System.out.println("Imprimindo...");
	agenda.imprimirAgenda();
		
	System.out.println("Imprimindo...");
	agenda.imprimirPessoa(7);
	}
}
