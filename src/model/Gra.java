package model;

abstract class Gra {
	
	int plansza[][];
	int wyb[] = new int[2];
	int gracz = 1;
	
	public abstract boolean ktoWygral();
	
	public void FillZero(){
		for(int i = 0; i < plansza.length; i++)
			for(int  j = 0 ; j < plansza[i].length; j++)
				plansza[i][j]=0;
	}
	public void display(){
		for(int i = 0; i < plansza.length; i++){
			for(int  j = 0 ; j < plansza[i].length; j++)
				System.out.print(plansza[i][j] + " ");	
			System.out.println();
		}
		
	}
	public boolean insert(int kolumna){
		for(int i = plansza.length-1; i >=0; i--){
			if ( plansza[0][kolumna] != 0){
				return false;
			}	
			else if (plansza[i][kolumna]==0) {
				plansza[i][kolumna]=gracz;
				wyb[0]=i;
				wyb[1]=kolumna;
				return true;
			}
		}
		return false;
	}
	protected boolean szuk_poziom(int need) {
	    int i = wyb[0];
	   	int j = wyb[1];
	   	int zlicz  = 0;
	   	int k = 1;
	   	while (j - k > -1){
	   		if(plansza[i][j - k] == gracz) zlicz ++;
	   		else break;
	   		k++;
	   	}
	   	while (j + k < plansza[i].length){
	   		if(plansza[i][j + k] == gracz) zlicz ++;
	   		else break;
	   		k++;
	   	}
		if (zlicz >= need - 1) return true;
		else return false;
	}

    protected boolean szuk_skos(int need){
        int i = wyb[0];
    	int j = wyb[1];
    	int zlicz1 = 0;
    	int zlicz2 = 0;
    	int k = 1;
    	while(i - k > -1 && j -k > -1){
    		if (plansza[i - k][j - k] == gracz) zlicz1++;
    		else break;
    		k ++;
    	}
    	k = 1;
    	while(i + k < plansza.length && j + k < plansza[i].length){
    		if (plansza[i + k][j + k] == gracz) zlicz1++;
    		else break;
    		k ++;
    	}
    	k = 1;
    	while(i + k < plansza.length && j -k > -1){
    		if (plansza[i + k][j - k] == gracz) zlicz2++;
    		else break;
    		k ++;

    	}
    	k = 1;
    	while(i - k > - 1 && j + k < plansza[i].length){
    		if (plansza[i - k][j + k] == gracz) zlicz2++;
    		else break;
    		k ++;
    	}
    	if(zlicz1 >= need-1 || zlicz2 >= need-1) return true;
    	else return false;
     }
    
    public void nastepnyGracz(){
    	if (gracz == 1) gracz = 2;
    	else if(gracz == 2)gracz = 1;
    }
    
    public int getGracz(){
    	return gracz;
    }
    public int[] getWyb(){
    	return wyb;
    }
}
