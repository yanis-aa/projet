
public class Omnidirectionnelle 
extends Antenne{
	private double Ge;
	private double Gr;
	public Omnidirectionnelle(double Pe, double Pr, double frequence, double sensibilite, String polarisation, double orientation, double ouverture) {
		super(Pe, Pr, frequence, sensibilite, polarisation, orientation, ouverture);
		
	}
	public double getGe() {
		return Ge;
	}
	public void setGe(double Ge) {
		this.Ge = Ge;
	}
	public double getGr() {
		return Gr;
	}
	public void setGr(double Gr) {
		this.Gr = Gr;
	}
	

}
