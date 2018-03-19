package start;
// tutaj powstaje model MVC ( Kontroler, widok , model) w zalezonci od wybranej 
//opcji w panelu  Menu 0 - ConnectFour 1- ConnectFive
// opcja 2  ->  otwiera Menu ( i tak jest na pocz¹tku ustawione

import Menu.Menu;
import kontroler.Kontroler;
import model.Modelmain;
import widok.PanelGry4;
import widok.PanelGry5;
import widok.StartGUI;
import model.ConnectFour;
import model.ConnectFive;

public class StartGame {
	Modelmain model = null;
	StartGUI view = null;
	Kontroler controler = null;
	Menu menu = null;
	
	public StartGame(int zasady){
		switch(zasady){
		
		case 0:	model = new Modelmain(new ConnectFour());
				view = new StartGUI(zasady, model);
				controler = new Kontroler(model, view,zasady);
				view.addController(controler);
				break;
		case 1:	model = new Modelmain(new ConnectFive());
				view = new StartGUI(zasady, model);
				controler = new Kontroler(model, view,zasady);
				view.addController(controler);
				break;
			
		case 2:	menu = new Menu();
		
					
	}
	
	}
}
