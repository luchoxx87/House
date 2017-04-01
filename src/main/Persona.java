package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucho
 * @version 1.0
 * @created 01-abr.-2017 13:08:57
 */
public class Persona {

	private double temperatura;
	private int cantidadCelulas;
	private List<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
	public Persona(){

	}

	public Persona(double unaTemperatura, int unaCantDeCelulas) {
		temperatura = unaTemperatura;
		cantidadCelulas = unaCantDeCelulas;
	}

	public void finalize() throws Throwable {
	
	}

	/**
	 * 
	 * @param unaEnfermedad
	 */
	public void contraerEnfermedad(Enfermedad unaEnfermedad){
		enfermedades.add(unaEnfermedad);
	}

	/**
	 * 
	 * @param n
	 */
	public void vivirNDias(int n){
		for(int i=0; i < n ; i++)
		{
			enfermedades.forEach(enfermedad -> enfermedad.afectar(this));
		}
	}

	public int celulasAfectadasPorAgresivas(){
		return enfermedades.stream().
			filter((Enfermedad enfermedad) -> enfermedad.esAgresiva()).
			mapToInt((Enfermedad enfermedad) -> enfermedad.celulasAmenzadas()).
			sum();
	}

	public Enfermedad enfermedadPeligrosa(){
		return null;
	}

	public boolean estaEnComa(){
		return true;
	}

	/**
	 * 
	 * @param grados
	 */
	public void subirTemperatura(float grados){
		temperatura = Math.min(temperatura+grados, 45);
	}

	public boolean tiene(Enfermedad unaEnfermedad) {
		return enfermedades.contains(unaEnfermedad);
	}

}