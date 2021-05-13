package parte2;

import java.util.List;
import java.util.stream.Collectors;
import parte1.*;

public class Alumno {
	private Integer nroMatricula;
	private String nombre;
	private List<Capacitacion> capacitacionesHechas;
	private List<Capacitacion> capacitacionesEnCurso;
	
	public Integer creditosObtenidos() {
		return this.capacitacionesHechas.stream().map(t->t.calcularCreditos()).collect(Collectors.summingInt(Integer::intValue));
	}
	
	public void inscribir(Capacitacion c) {
		try {
			c.inscribir(this);
			this.capacitacionesEnCurso.add(c);
		}
		catch(CreditosInsuficientesException e) {
			System.out.println("No se puede inscribir al alumno en el curso. "+e);
		}
		catch(TallerCompletoException e) {
			System.out.println("No se puede inscribir al alumno en el taller. "+e);
			
		}
		
	}
	
	public void aprobar(Capacitacion c) {
		c.aprobar(this);
		this.capacitacionesEnCurso.remove(c);
		this.capacitacionesHechas.add(c);
	}

}
