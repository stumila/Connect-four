package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.ConnectFive;
import model.ConnectFour;


	public class TestGetWyb5 {

		@Test
		public void TestGetWyb() {
			ConnectFive five = new ConnectFive();
		
			assertNotEquals(9,five.getWyb().length);
			for(int i = 0; i < five.getWyb().length; i++){
				assertNotEquals(3, five.getWyb()[i]);
			}
	

			
		}

	}


