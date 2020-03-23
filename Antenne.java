
public class Antenne {
	
	private double Pe;
	private double Pr;
	private double frequence;
	private double sensibilite;
	private String polarisation;
	private double orientation;
	private double ouverture;
	private double 
	public double getPe() {
		return Pe;
	}
	public void setPe(double Pe) {
		this.Pe = Pe;
	}
	public double getPr() {
		return Pr;
	}
	public void setPR(double Pr) {
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

public Antenne (double Pe, double Pr,  double frequence, double sensibilite, String polarisation, double orientation, double ouverture) {
this.Pe=Pe;
this.Pr=Pr;
this.frequence=frequence;
this.sensibilite=sensibilite; 
this.polarisation=polarisation;
this.orientation=orientation;
this.ouverture=ouverture;	
}

public void liste(Antenne antenne) {
	System.out.println(getPe());
	System.out.println(getFrequence());
	System.out.println(getSensibilite());
	System.out.println(getPolarisation());
	System.out.println(getOrientation());
	System.out.println(getOuverture());
	
}
public void  joignable( Antenne antenne) {
	
	

	//Pr=Pe+20log(λ/4 πR ) +Ge dB (θ)+Gr dB (θ )+Ep;
	
}
}

