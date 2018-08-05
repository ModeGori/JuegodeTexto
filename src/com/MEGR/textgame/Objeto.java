package com.MEGR.textgame;

public abstract class Objeto implements VisitorV {
	
	public String name;
	public String description;
	public int value;
	
	public Objeto(String name, String description, int value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.name + "\n==========\n" + this.description + "\nValue:" + this.value;
	}
	
	public void accept(VisitorV v) {

	}

}

