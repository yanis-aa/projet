
public class Antenne {
	
	
	
	  
	private static final double π= 3.14;
	private static double r;
	private static double ep;
    private static double λ;
    private static double Ge;
    private static double Gr;

	private double Pe;
	private double Pr;
	private double frequence;
	private double sensibilite;
	private String polarisation;
	private double orientation;
	private double ouverture;
	private double teta;
	
	public double getPe() {
		return Pe;
	}
	public void setPe(double Pe) {
		this.Pe = Pe;
	}
	public double getPr() {
		return Pr;
	}
	public void setPr(double Pr) {
		this.Pr = Pr;
	}
	public double getFrequence() {
		return frequence;
	}
	public void setFrequence(double frequence) {
		this.frequence = frequence;
	}
	public double getSensibilite() {
		return sensibilite;
	}
	public void setSensibilite(double sensibilite) {
		this.sensibilite = sensibilite;
	}
	public String getPolarisation() {
		return polarisation;
	}
	public void setPolarisation(String polarisation) {
		this.polarisation = polarisation;
	}
	public double getOrientation() {
		return orientation;
	}
	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}
	public double getOuverture() {
		return ouverture;
	}
	public void setOuverture(double ouverture) {
	
		this.ouverture = ouverture;
	}
	public double getTeta() {
		return teta;
	}
	public void setTeta(double teta) {
		this.teta = teta;
	}

public Antenne (double Pe, double Pr,  double frequence, double sensibilite, String polarisation, double orientation, double ouverture) {
this.Pe=Pe;
this.Pr=Pr;
this.frequence=frequence;
this.sensibilite=sensibilite; 
this.polarisation=polarisation;
this.orientation=orientation;
this.ouverture=ouverture;	

}


public String Joindre (Antenne antenne) {
	
	
	r=100;
	Ge=20;
	Gr=4;
	λ=1/2;

Pr=Pe+20*Math.log(λ/4*π*r ) +Ge +Gr +ep;


if (antenne.getSensibilite() < Pr ) {
	return "true";
}
	else {
		return "false";
	}
}
}



