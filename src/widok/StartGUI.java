package widok;


import javax.swing.*;

import kontroler.Kontroler;
import model.Modelmain;
import model.Observer;

import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
//implements ActionListener

public class StartGUI extends Observer {
	public static final int HEIGHT = 800;
	public static final int WIDTH = 600;
	JFrame grafika;
	//ArrayList<JButton> buttons;
	int zasada=0;
	PanelGry4 panel4;
	PanelGry5 panel5;
	private Object subject;
	private Modelmain model;

	public StartGUI(int zasady, Modelmain model){
		super();
		this.model = model;
		this.model.attach(this);
		this.zasada=zasady;
		this.go();
		
	}
	
	//public static void main(String[] args) {
		//StartGUI ap = new StartGUI();
		//ap.go();
		
	//}
	
	public void go(){
		JFrame grafika = new JFrame();
		grafika.setLayout(new BorderLayout());
		grafika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel tk1 = new JLabel("Teraz gra ");
		tk1.setBackground(Color.blue);
		tk1.setSize(WIDTH, 100);
		
		if( zasada == 0){
			panel4 = new PanelGry4();
			grafika.getContentPane().add(BorderLayout.CENTER, panel4);
			//
		}
		else if(zasada == 1){
			panel5 = new PanelGry5();
			grafika.getContentPane().add(BorderLayout.CENTER, panel5);

		}
		grafika.getContentPane().add(BorderLayout.NORTH, tk1);
		grafika.setSize(HEIGHT,WIDTH);
		grafika.setVisible(true);
	}
	public void column(int j){
		System.out.println(j);
	}
	
	public void update(int[] wyb, int gracz){
		int i = wyb[0];
		int j = wyb[1];
		if(zasada == 0){
			panel4.dodajkulke(i,j,gracz);
		}
		else if(zasada == 1){
			panel5.dodajkulke(i,j,gracz);
		}
	}
	public void kolumnaFull(){
		JOptionPane.showMessageDialog(null, "Wybierz inna kolumne");
		
	}
	public void Wygrana(int gracz){
		String message = "Gratulacje wygral gracz " + gracz;
		JOptionPane.showMessageDialog(null, message);
		if(zasada == 0){
			panel4.clearPanel();
		}
		else if(zasada == 1){
			panel5.clearPanel();
		}
	}
	
	public void addController(ActionListener controller){
		if(zasada == 0){
			panel4.setActionListener(controller);
			panel4.createButtons(7);
		}
		if(zasada == 1){
			panel5.setActionListener(controller);
			panel5.createButtons(9);
		}
	
	}
	
	public int getZasada(){
		return zasada;
	}
	
	
	
	
}
