package parte1;

import parte2.*;

public class Taller extends Capacitacion {
	//Atributes
	private Integer cantidadInscriptos;
	private Integer cupoMaximo;
	private Integer duracion;
	private Double costoPorHora;
	
	//Methods
	public Taller() {
		this.creditosMinimos = 0;
	}
	
	@Override
	public Integer calcularCreditos() {
		if(this.prioritaria) return Math.min(duracion/6,12)+1;
		return Math.min(duracion/6,12);
	}
	
	@Override
	public Double calcularCosto() {
		Double costo = this.costoPorHora * this.duracion;
		if(this.prioritaria)
			return costo * 0.2 + costo;
		
		return costo;
	}
	
	@Override
	public void inscribir(Alumno a) throws TallerCompletoException{
		
		if(cupoMaximo.equals(cantidadInscriptos)) throw new TallerCompletoException();
		
		cantidadInscriptos++;
		
	}
	
	@Override
	public void aprobar(Alumno a) {
		cantidadInscriptos--;
	}
	

}
