package ar.edu.unlam.basica2;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<cliente> {



	@Override
	public int compare(cliente cliente , cliente cliente1) {
	
		return cliente.getEdad() - cliente1.getEdad();
	 }
	}
