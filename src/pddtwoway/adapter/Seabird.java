package pddtwoway.adapter;

import pddtwoway.interfaces.IAircraft;
import pddtwoway.target.SearcraftImpl;

public class Seabird extends SearcraftImpl implements IAircraft{
	
	private int height;	
	
	public Seabird() {
		height = 0;
	}
	
	@Override
	public void increaseRevs() {
		
		super.increaseRevs();
		if(speed > 40) {
			height += 100;
		}
	}

	@Override
	public void takeoff() {
		
		while(!airborne()) {
			increaseRevs();
		}
	}

	@Override
	public int height() {
		return height;
	}
	

	@Override
	public boolean airborne() {
		return height > 50 ? true : false;
	}	
}
