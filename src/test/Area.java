package test; //package=Schlüsselwort

public class Area //area=Klassennamen
{ //Block 1
	public static void main(String[] args)
	{ //Block 2
		//Start des Programms
		double height; //Kommentar in grün, double=Typdeklaration, height=Varaible
		double width;
		double area; //Anweisungen werden mit ; beendet
		
		height = 2.0; //Wertzuweisung
		width = 5.5;
		area = height * width; // * =Operator
		
		System.out.println("Fläche = " + area + "m\u00B2"); //Anweisungssequenz
		//Ende des Programms
	}

}
