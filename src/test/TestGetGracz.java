package test;

import static org.junit.Assert.*;

import java.awt.GradientPaint;

import org.junit.Test;

import model.ConnectFive;
import model.ConnectFour;


public class TestGetGracz {

	@Test
	public void TestGetGracz() {
		ConnectFour four = new ConnectFour();
		assertNotEquals(3,four.getGracz());
		assertNotEquals(5,four.getGracz());
		assertNotEquals(4,four.getGracz());
		
	
		ConnectFive five = new ConnectFive();
		assertNotEquals(3,five.getGracz());
		assertNotEquals(5,five.getGracz());
		assertNotEquals(4,five.getGracz());
		
	}

}
