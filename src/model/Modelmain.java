package model;
import java.util.ArrayList;
import java.util.List;

public class Modelmain{
	
	public InterModel game = null;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Modelmain(InterModel game){
		this.game = game;
	
	}
	public void modelInsert (int j){
		if(game.insert(j) == true){
			notifyAllObservers(0);
		}
		else notifyAllObservers(1);
		// sprawdza czy ktos wygral
		if(ktoWygral()==true) {
			notifyAllObservers(2);
			game.FillZero();
		}
		else nastepnyGracz();
	}
	public int getGracz(){
		return game.getGracz();
	}
	
	public boolean ktoWygral(){
		return game.ktoWygral();
	}
	public int[] getWyb(){
		return game.getWyb();
	}
	
	public void attach(Observer observer){
	      observers.add(observer);		
	 } 
	public void notifyAllObservers(int i){
		if(i==0){
	      for (Observer observer : observers) {
	         observer.update(getWyb(),getGracz());
	      	}    
	      }
		else if(i==1){
			for (Observer observer : observers) {
		         observer.kolumnaFull();
		      	}    
		      }
		else if(i==2){
			for (Observer observer : observers) {
		         observer.Wygrana(getGracz());
		      	}    
		      }
		
	   } 
	
	public void nastepnyGracz(){
		game.nastepnyGracz();
	}
	
}
