package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.ConnectFive;
import model.ConnectFour;

public class TestStart {

	@Test
	public void TestStart() {
		assertNotNull(new ConnectFive());
		assertNotNull(new ConnectFour());
	}

}
