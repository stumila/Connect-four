package test;

import static org.junit.Assert.*;

import org.junit.Test;

//import org.junit.Test;

import model.ConnectFour;
import model.Modelmain;
import widok.StartGUI;

public class TestZasada {

	@Test
	public void TestZasada() {
		Modelmain model = new Modelmain(new ConnectFour());
		
		StartGUI start1 = new StartGUI(0, model);
		assertNotEquals(1, start1.getZasada());
		
		StartGUI start2 = new StartGUI(1, model);
		assertNotEquals(0, start2.getZasada());
		
		
	}

}
