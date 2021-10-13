package exception;

public class InvalionDedtException extends RuntimeException {

	public InvalionDedtException(double valor) {
		super("deuda invalida: deuda igual a cero o negativa \n Valor causante: "+valor);
	}
	
	
}
