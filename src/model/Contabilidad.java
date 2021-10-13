package model;

import java.util.ArrayList;
import java.util.UUID;

import exception.InvalionDedtException;

public class Contabilidad {

	private ArrayList<PeriodoCont> periodo;

	public Contabilidad() {
		
		periodo = new ArrayList<>();
		PeriodoCont peridodocont= new PeriodoCont();
		periodo.add(peridodocont);
	}
	
	public void addDebts(double... valor) throws InvalionDedtException {
		for(double d: valor) {
			periodo.get(0).addDebt(d, UUID.randomUUID().toString());
		}
	}
	
	
}
