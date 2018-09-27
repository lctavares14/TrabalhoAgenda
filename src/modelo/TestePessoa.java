package modelo;

import java.time.LocalDate;

public class TestePessoa {
	
	public static void main (String[] args) {
		
		Pessoa pessoa = new Pessoa ("Nome Astrogildo", LocalDate.of(1976, 7, 16), Double.valueOf("1.89"));
		
		
		System.out.println(pessoa.toString());
		

	}

}
