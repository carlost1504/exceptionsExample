package model;

import exception.InvalionDedtException;

public class Deudor {

	private Contabilidad contable;

	public Deudor() throws InvalionDedtException {
		contable = new Contabilidad();
		contable .addDebts(400,300,0);
	}
	
	
}
