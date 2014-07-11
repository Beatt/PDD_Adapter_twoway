package pddtwoway.client;

import pddtwoway.adapter.Seabird;
import pddtwoway.interfaces.IAircraft;
import pddtwoway.interfaces.ISeacraft;
import pddtwoway.target.AircraftImpl;

/*
 * Objetivo: Se tiene que crear un seabird. 
 * 		Se cuenta con un motor de avión el cual tiene su propia
 * 			implementación y su interfaz, se tendrá que 
 * 			reutilizar su interfaz para combinarla con el motor
 * 			del bote(seacraft). Así cada motor tendrá su propia
 * 			implementación y se adaptara perfectamente para que
 * 			nuestro bote funcione.
 */
public class Client {

	public static void main(String[] args) {
		
		/*
		 * Motor del avión funcionando solo.
		 */		
		System.out.println("Experiment 1: Test the aircraft engine");
		IAircraft aircraft = new AircraftImpl();
		aircraft.takeoff();
		
		if(aircraft.airborne()) {
			System.out.println("The aircraft engine is fine, flying at " + aircraft.height() + " meters");
		}
		
		/*
		 * Seabird que combina el motor del avión con el bote(seacraf).
		 * 		Se eleva el seabird a una altura de 200, igual que el motor
		 * 			del avión.
		 */
		System.out.println("Experiment 2: Test the searcraft engine");
		IAircraft searcraft = new Seabird();
		searcraft.takeoff();
		System.out.println("The seabird took off");
		
		/*
		 * Utilizamos el motor del Searcraft 
		 * 		para aumentar su velocidad y por ende
		 * 		su altura.	 		 
		 *    	
		 */
		System.out.println("Experiment 3: Increase the speed of the seabird");
		if(searcraft instanceof ISeacraft) {
			((ISeacraft)searcraft).increaseRevs();
		}
		if(searcraft instanceof ISeacraft) {
			((ISeacraft)searcraft).increaseRevs();
		}
		if(searcraft.airborne()) {
			System.out.println("Seabird flying at height " + searcraft.height() +
					" meters and speed " + ((ISeacraft)searcraft).speed +  " knots");
			System.out.println("Experiment successful; the seabird flies!");
		}
		
	}

}//Fin class Client 
