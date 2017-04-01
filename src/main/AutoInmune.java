package main;

/**
 * @author Lucho
 * @version 1.0
 * @created 01-abr.-2017 13:02:02
 */
public class AutoInmune extends Enfermedad {

	private int diasAfectados;

	public AutoInmune(int cantCelulas){
		super(cantCelulas);
		diasAfectados = 0;
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

}