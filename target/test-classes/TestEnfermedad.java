package test.resources;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.AutoInmune;
import main.Enfermedad;
import main.Infecciosa;
import main.Persona;

public class TestEnfermedad {

	public Infecciosa malaria500, malaria800, otitis;
	public AutoInmune lupus;
	public Persona logan, frank;
	@Before
	public void setup(){
		malaria500 = new Infecciosa(500);
		malaria800 = new Infecciosa(800);
		otitis = new Infecciosa(100);
		lupus = new AutoInmune(10000);
		logan = new Persona(36.0, 3000000);
		frank = new Persona(36.0, 3500000);
		logan.contraerEnfermedad(malaria500);
		logan.contraerEnfermedad(otitis);
		logan.contraerEnfermedad(lupus);
	}
	
	@Test
	public void frankContraeMalaria800Test() {
		frank.contraerEnfermedad(malaria800);
		Assert.assertTrue(frank.tiene(malaria800));
	}

	@Test
	public void malariaLoganSeReproduce(){
		malaria500.reproducirse();
		Assert.assertEquals(1000,malaria500.celulasAmenzadas());
	}
}
