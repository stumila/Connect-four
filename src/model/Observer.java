package model;

public abstract class Observer {
	protected Modelmain game;
	public abstract void update(int[] getWyb, int gracz);
	public abstract void kolumnaFull();
	public abstract void Wygrana(int gracz);
}
