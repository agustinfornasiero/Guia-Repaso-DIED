package parte1;

import parte2.*;

public abstract class Capacitacion {
	//Atributes
	protected String nombre;
	protected boolean prioritaria;
	protected Tema tema;
	protected Integer creditosMinimos;
	
	//Methods and Constructors
	public abstract Integer calcularCreditos();
	public abstract Double calcularCosto();
	
	public Tema getTema() {
		return this.tema;
	}
	public Integer getCreditosMinimos() {
		return this.creditosMinimos;
	}
	
	public abstract void inscribir(Alumno a) throws CreditosInsuficientesException,TallerCompletoException;
	public abstract void aprobar(Alumno a);
	
}
