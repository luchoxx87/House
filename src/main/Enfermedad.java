package main;


/**
 * @author Lucho
 * @version 1.0
 * @created 01-abr.-2017 13:02:02
 */
public abstract class Enfermedad {

	private int celulasAmenzadas;

	public Enfermedad(int cantCel){
		celulasAmenzadas = cantCel;
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param unaPersona
	 */
	public abstract void afectar(Persona unaPersona);

	public abstract boolean esAgresiva();
	
	public int celulasAmenzadas(){
		return celulasAmenzadas;
	}
	
	public void celulasAmenazadas(int cantCel)
	{
		celulasAmenzadas = cantCel;
	}
}