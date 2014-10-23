package br.com.sankhya.open.dojo.anobissexto;

public class AnoBissexto {
	
	public boolean ehBissexto(int ano) {
		boolean ehDivisivelPor4 = ano % 4 == 0;
		boolean ehDivisivelPor100 = ano % 100 == 0;		
		boolean ehDivisivelPor400 = ano % 400 == 0;
		return  ehDivisivelPor4 && ( ! ehDivisivelPor100 || ehDivisivelPor400);
	}
}
