package parte2;

public class CreditosInsuficientesException extends Throwable{
	public CreditosInsuficientesException() {
		super("El alumno no posee los creditos suficientes para inscribirse al curso");
	}
}
