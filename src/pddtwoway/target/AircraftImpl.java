package pddtwoway.target;

import pddtwoway.interfaces.IAircraft;

/*
 * Objetivo; Implementación del motor de un avión 'x'.
 */
public class AircraftImpl implements IAircraft{

	private int height;
	private boolean airborne;
	
	public AircraftImpl() {
		airborne = false;
		height = 0;
	}
	
	@Override
	public void takeoff() {
		
		System.out.println("Aircraft engine takeoff");
		airborne = true;
		height = 200;
		
	}

	@Override
	public boolean airborne() {
		return airborne;
	}

	@Override
	public int height() {
		return height;
	}
	
}//Fin class Aircraft
