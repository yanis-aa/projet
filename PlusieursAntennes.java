
public class PlusieursAntennes {
	private double r;
	private double Ep;

public double getR() {
	return r;
}

public void setR(double r) {
	this.r = r;
}

public double getEp() {
	return Ep;
}

public void setEp(double ep) {
	Ep = ep;
}
	
public static void main (String [] args ) {
	
Antenne antenne1=new Antenne(-20.3, 30.5, 2000.00, -30.1, "horizontal", -3.4, -5.5 );
Antenne antenne2=new Antenne(-10, 15, 5050, -35, "horizontal", -60, -10 );
Antenne antenne3=new Antenne(-5, 20, 3000, -25, "vertical", -18, -7 );

System.out.println("voici l'antenne1 et ses caractéristiques sont :" ); 
liste( antenne1);

/*System.out.println(antenne1.getPe());
System.out.println(antenne1.getFrequence());
System.out.println(antenne1.getSensibilite());
System.out.println(antenne1.getPolarisation());
System.out.println(antenne1.getOrientation());
System.out.println(antenne1.getOuverture());
*/
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

}

private static void liste(Antenne antenne1) {
	// TODO Auto-generated method stub
	
}

}
