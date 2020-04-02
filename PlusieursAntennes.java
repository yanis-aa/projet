
public class PlusieursAntennes {
	public static final double π= 3.14;
	private double r;
	private double ep;
    private double λ;
    //private double R;
    
public double getR() {
	return r;
}

public void setR(double r) {
	this.r = r;
}

public double getEp() {
	return ep;
}

public void setEp(double ep) {
	this.ep = ep;
}
	
public static void main (String [] args ) {
	
Antenne antenne1=new Antenne(-20.3, 30.5, 2000.00, -30.1, "horizontal", -3.4, -5.5 );
Antenne antenne2=new Antenne(-10, 15, 5050, -35, "horizontal", -60, -10 );
Antenne antenne3=new Antenne(-5, 20, 3000, -25, "vertical", -18, -7 );
//pour afficher les caractéristiques d'une antenne
System.out.println("voici l'antenne1 et ses caractéristiques sont :" ); 
System.out.println(antenne1.getPe());
System.out.println(antenne1.getFrequence());
System.out.println(antenne1.getSensibilite());
System.out.println(antenne1.getPolarisation());
System.out.println(antenne1.getOrientation());
System.out.println(antenne1.getOuverture());

System.out.println("voici l'antenne2 et ses caractéristiques sont :" );

System.out.println(antenne2.getPe());
System.out.println(antenne2.getFrequence());
System.out.println(antenne2.getSensibilite());
System.out.println(antenne2.getPolarisation());
System.out.println(antenne2.getOrientation());
System.out.println(antenne2.getOuverture());
System.out.println("voici l'antenne3 et ses caractéristiques sont :" );

System.out.println(antenne3.getPe());
System.out.println(antenne3.getFrequence());
System.out.println(antenne3.getSensibilite());
System.out.println(antenne3.getPolarisation());
System.out.println(antenne3.getOrientation());
System.out.println(antenne3.getOuverture());


/*public boolean Joindre  (Antenne antenne) {
	
	

	Pr=Pe+20*log(λ/4*π*R ) +Ge +Gr +Ep;

	
	if (antenne.getSensibilite() < ep ) {
		return true;
	}
		else {
			return false ;
		}
}
	
r=200;
Ge=20;
Gr=4;
λ=1/2;

antenne1.joindre(antenne2);
if (antenne1.joinde(antenne2)== "true") {
	System.out.println ("l'antenne1 peut joindre l'antenne2");
}
antenne1.joindre(antenne3);

if (antenne1.joinde(antenne3)== "true") {
	System.out.println ("l'antenne1 peut joindre l'antenne3");
}

}*/
}
}