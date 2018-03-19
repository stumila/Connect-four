package widok;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

	public class PanelGry5 extends JPanel implements StrategyWidok {
		private int w = 450;
		private int h = 300;
		private int x0=150;
		private int y0=100;
		private int wiersz;
		private int kolumna;
		private int tgracz;
		CircleList kola = new CircleList(x0,y0);
		ArrayList<JButton> buttons;
		ActionListener act;
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			this.setBackground(Color.GRAY);
			
			g.setColor(Color.WHITE);
			for(int i = 0; i < 10; i++){
				g.drawLine(x0 + i*50, y0, x0 + i*50, h + y0 );
			}
			g.drawLine(x0, h+y0, w+x0, h + y0 );
			
			this.setLayout(null);
			kola.drawCircle(g);
		}
		
		void createButtons(int need){
			buttons = new ArrayList<JButton>();
			for(int i =0; i < need; i++){
				String t = Integer.toString(i);
				JButton b = new JButton(t);
				buttons.add(b);
			}
			for(JButton button : buttons ){
				int i = buttons.indexOf(button);
				button.setBounds(x0+10+i*50, y0-50, 30, 40);
				button.addActionListener(act);
				System.out.println(act);
				this.add(button);
			}
		}
		public void dodajkulke(int i , int j, int gracz){
			kolumna=j;
			wiersz=i;
			tgracz=gracz;
			kola.adCircle(wiersz,kolumna,tgracz);
			this.repaint();
			
		}
		
		public void setActionListener(ActionListener set){
			act=set;
			
		}
		public void clearPanel(){
			kola.clearList();
			this.repaint();
		}
	}
	

	