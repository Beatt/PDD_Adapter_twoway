package pddtwoway.target;

import pddtwoway.interfaces.ISeacraft;

/*
 * Objetivo: Contiene la implementación que se tiene
 *		del bote(searcraft).
 */
public class SearcraftImpl extends ISeacraft{

	public SearcraftImpl() {
		speed = 0;
	}
	
	@Override
	public void increaseRevs() {
		
		speed += 10;
		System.out.println("Searcraft engine increases revs to " + speed + " knots");
	}
	
	
	
}
