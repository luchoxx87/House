package main;


/**
 * @author Lucho
 * @version 1.0
 * @created 01-abr.-2017 13:02:02
 */
public class Infecciosa extends Enfermedad {

	public Infecciosa(int cantCelulas){
		super(cantCelulas);
	}
	
	/**
	 * 
	 * @param unaPersona
	 */
	public void afectar(Persona unaPersona){
		
	}

	public boolean esAgresiva(){
		return true;
	}

	public void reproducirse(){
		this.celulasAmenazadas(this.celulasAmenzadas()*2);
	}

}