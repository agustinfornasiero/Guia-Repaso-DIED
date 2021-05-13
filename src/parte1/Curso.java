package parte1;

import parte2.*;
public class Curso extends Capacitacion {
	//Aributes
	private Docente docente;
	private Integer cantidadClases;
	private Integer duracionClases;
	
	//Methods and Constructors
	@Override
	public Integer calcularCreditos() {
		Integer creditoPorClase = Math.min(cantidadClases/2,10);
		Integer antiguedadDocente = this.docente.getAntiguedad();
		
		if(antiguedadDocente < 6) {
			creditoPorClase++;
		}
		else if(antiguedadDocente < 16) {
			creditoPorClase += 3;
		}
		else {
			creditoPorClase += 5;
		}
		
		return creditoPorClase;
		}
	
	@Override
	public Double calcularCosto() {
		Double costo = this.docente.getCostoPorHora() * cantidadClases * duracionClases;
		
		if(this.prioritaria) {
			return costo * 1.1;
		}
		
		return costo;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	@Override
	public void inscribir(Alumno a) throws CreditosInsuficientesException{
		
		if(a.creditosObtenidos()<this.creditosMinimos) throw new CreditosInsuficientesException();
		
	}
	
	@Override
	public void aprobar(Alumno a) {
		
	}
}
