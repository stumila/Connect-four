package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.ConnectFive;
import model.ConnectFour;


	public class TestGetWyb {

		@Test
		public void TestGetWyb() {
			ConnectFour four = new ConnectFour();
		
			assertNotEquals(6,four.getWyb().length);
			for(int i = 0; i < four.getWyb().length; i++){
				assertNotEquals(3, four.getWyb()[i]);
			}
	

			
		}

	}


