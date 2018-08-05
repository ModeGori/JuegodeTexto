package com.MEGR.textgame;
import com.MEGR.textgame.Decorator;
public class Orco extends Deco {
private Decorator decorator;
	
	public Orco(Decorator decorator) {
		this.decorator = decorator;
	}

	@Override
	public int getDamage() {
		
		return decorator.getDamage() + 5;
	}

	@Override
	public int getHP() {
		return decorator.getHP() + 70;
	}
	
	@Override
	public String getDesc() {
		return decorator.getDesc() + " Orc ";
	}

}

