package model;

import exception.InvalionDedtException;

public class Deudas {

	private double valor;
	private String referencia;
	public Deudas(double valor, String referencia) throws InvalionDedtException {
		super();
		
		if(valor<= 0) {
			throw new InvalionDedtException(valor);
		}else {
			this.valor = valor;
			this.referencia = referencia;
		}
		
	}
	public double getValor() {
		return valor;
	}
	public String getReferencia() {
		return referencia;
	}
	
	
}

