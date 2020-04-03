public class PlusieursAntennes {

	
    //private double R;
    



	
public static void main (String [] args ) {
	
Antenne antenne1=new Antenne(-20.3, 30.5, 2000.00, -30.1, "horizontal", -3.4, -5.5 );
Antenne antenne2=new Antenne(-10, 15, 5050, -35, "horizontal", -60, -10 );
Antenne antenne3=new Antenne(-5, 20, 3000, -25, "vertical", -18, -7 );
//pour afficher pour chaque antenne ses caractéristiques et les antennes avec qui elle peut communiquer
	
System.out.println("voici l'antenne1 et ses caractéristiques sont:") ;
	antenne1.affaiche();
	//antenne1.joindre(antenne1, antenne2);
if (antenne1.joindre(antenne2)== "true") {
	System.out.println ("l'antenne1 peut joindre l'antenne2");
}
	if (antenne1.joindre(antenne1, antenne3)== "true") {
	System.out.println ("l'antenne1 peut joindre l'antenne3");
}
	
System.out.println("voici l'antenne2 et ses caractéristiques sont:");
	antenne2.affaiche();
	//antenne2.joindre(antenne2, antenne1);
if (antenne2.joindre(antenne2, antenne1)== "true") {
	System.out.println ("l'antenne2 peut joindre l'antenne1"); 
}								 
	if (antenne2.joindre(antenne2,antenne3)== "true") {   	
	System.out.println ("l'antenne2 peut joindre l'antenne3");
	
}

System.out.println("voici l'antenne3 et ses caractéristiques sont:");
	antenne3.affaiche();
	//antenne1.joindre(antenne1, antenne2);
if (antenne3.joindre(antenne3, antenne1)== "true") {
	System.out.println ("l'antenne3 peut joindre l'antenne1");
}
	if (antenne3.joindre(antenne3, antenne2)== "true") {
	System.out.println ("l'antenne3 peut joindre l'antenne2");
}

/*parce qu' on suppose  que une antenne peut-etre à la fois émettri
	et réceptrice et l'antenne1 peut joindre l'antenne2 sans 		
	que cette drnière ne soit en mesure de la joindre en retour*/
	
}
}
