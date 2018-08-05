package com.MEGR.textgame;
import com.MEGR.textgame.Decorator;
public class Hermitaño extends Deco {
private Decorator decorator;
	
	public Hermitaño(Decorator decorator) {
		this.decorator = decorator;
	}

	@Override
	public int getDamage() {
		
		return decorator.getDamage() + 10;
	}

	@Override
	public int getHP() {
		return decorator.getHP() + 20;
	}
	
	@Override
	public String getDesc() {
		return decorator.getDesc() + " Hermitaño ";
	}

}