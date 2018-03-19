package start;
import java.awt.EventQueue;


public class Start {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				new StartGame(2); // wywolanie Startgame -> menu
			}
		});
		

	}

}
