package parte1;

public class NoExistenCursosRegistradosException extends Throwable {
	public NoExistenCursosRegistradosException() {
		super("El empleado no posee ningun curso registrado ");
	}
}
