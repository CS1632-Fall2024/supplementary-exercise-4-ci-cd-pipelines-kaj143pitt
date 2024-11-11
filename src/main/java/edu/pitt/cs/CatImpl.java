package edu.pitt.cs;

public class CatImpl implements Cat {

	private int ID;
	private String Name;
	private boolean Rented;

	public CatImpl(int id, String name) {
		ID = id;
		Name = name;
		Rented = false;
	}

	public void rentCat() {
		Rented = true;
	}

	public void returnCat() {
		Rented = false;
	}

	public void renameCat(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public int getId() {
		return ID;
	}

	public boolean getRented() {
		return Rented;
	}

	public String toString() {
		return "ID " + ID + ". " + Name;
	}

}