
public class PlusieursAntennes {

	
    //private double R;
    


}
	
public static void main (String [] args ) {
	
Antenne antenne1=new Antenne(-20.3, 30.5, 2000.00, -30.1, "horizontal", -3.4, -5.5 );
Antenne antenne2=new Antenne(-10, 15, 5050, -35, "horizontal", -60, -10 );
Antenne antenne3=new Antenne(-5, 20, 3000, -25, "vertical", -18, -7 );
//pour afficher les caractéristiques d'une antenne






antenne1.joindre(antenne1, antenne2);
if (antenne1.joinde(antenne2)== "true") {
	System.out.println ("l'antenne1 peut joindre l'antenne2");
}
antenne1.joindre(antenne3);

if (antenne1.joinde(antenne3)== "true") {
	System.out.println ("l'antenne1 peut joindre l'antenne3");
}

}
}
}
