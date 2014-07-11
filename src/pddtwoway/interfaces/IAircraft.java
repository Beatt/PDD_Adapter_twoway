package pddtwoway.interfaces;

/*
 * Objetivo: Interfaz para implementar el motor
 * 		de un aircraft.
 */
public interface IAircraft {
	
	 boolean airborne();
	 abstract void takeoff();
	 int height();	
}
