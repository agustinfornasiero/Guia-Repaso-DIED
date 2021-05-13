package parte2;

public class TallerCompletoException extends Throwable {
	public TallerCompletoException() {
		super("El taller al que se quiere inscribir se encuentra completo");
	}
}
