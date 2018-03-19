package model;

public class ConnectFour extends Gra implements InterModel{
	int need = 4;
	public ConnectFour(){
		plansza = new int[6][7];
		FillZero();
	}
	public boolean ktoWygral(){
    	if(szuk_pion()==true || szuk_poziom(need) == true || szuk_skos(need)== true ) return true;
    	else return false;
	}
	protected boolean szuk_pion(){
		int x = wyb[0];
		int y = wyb[1];
		int zlicz  = 0;
	   	int k = 1;
	   	while (x + k < plansza.length){
	   		if(plansza[x + k][y] == gracz) zlicz ++;
	   		else break;
	   		k++;
	   	}
	   	if (zlicz >= need - 1) return true;
		else return false;
	
	}

	
}
