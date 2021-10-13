package model;

import java.util.ArrayList;

import exception.InvalionDedtException;

public class PeriodoCont {

	private ArrayList<Deudas>  deudas;

	public PeriodoCont() {
		
		deudas = new ArrayList<Deudas>();
	}

	public void addDebt(double valor,String ref) throws InvalionDedtException {
		Deudas d= new Deudas(valor,ref);
	}
	
	
	
}
