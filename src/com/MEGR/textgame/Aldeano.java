package com.MEGR.textgame;
import com.MEGR.textgame.Decorator;
public class Aldeano extends Deco {
private Decorator decorator;
	
	public Aldeano(Decorator decorator) {
		this.decorator = decorator;
	}

	@Override
	public int getDamage() {
		
		return decorator.getDamage() + 2;
	}

	@Override
	public int getHP() {
		return decorator.getHP() + 40;
	}
	
	@Override
	public String getDesc() {
		return decorator.getDesc() + " Aldeano ";
	}

}