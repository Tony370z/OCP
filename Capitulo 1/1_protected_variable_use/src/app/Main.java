package app;

import app.others.Carlos;

/**
 * Exercise where I put into practice the use of protected.
 * 
 * Result:
 * 1) If in the same package creating the object responsible for the protected.
 * 2) If in another package only through inheritance does it work.
 * @author tony_
 *
 */
public class Main extends Carlos{
//public class Main{ It does not work this way either

	public static void main(String[] args) {
		
		Main m = new Main();
		Ana ana = new Ana();
		Carlos carlos = new Carlos();
		
		System.out.println("Ana same package " + ana.name);
		m.print();
		System.out.println("Carlos by inheritance" + m.lastName); //It works this way
		System.out.println("Carlos same package " + carlos.lastName); //It does not work

	}
	
	void print() { //It works this way
		System.out.println("Carlos by inheritance " + lastName);
	}

}
