package kontroler;

import model.Modelmain;
import widok.StartGUI;
import java.awt.event.ActionListener;

public class Kontroler implements ActionListener {
	
	public Modelmain model=null;
	public StartGUI view=null;

	public Kontroler(Modelmain model, StartGUI view, int zasady){
		this.view = view;
		this.model = model;
	}
	
	public void setColumnNumber(int j){
		model.modelInsert(j);
	}
	public int getGracz(){
		return model.getGracz();
	}
	public void actionPerformed(java.awt.event.ActionEvent e){
		String ac = e.getActionCommand();
		int j = Integer.parseInt(ac);
		model.modelInsert(j);
	}
}
