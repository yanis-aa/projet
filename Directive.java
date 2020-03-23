
public class Directive 
extends Antenne      {
	private double Ge;
	private double Gr;
	
	public Directive(double Pe, double Pr, double frequence, double sensibilite, String polarisation, double orientation, double ouverture) {
		super(Pe, Pr, frequence, sensibilite, polarisation, orientation, ouverture);
	}

	public double getGe() {
		return Ge;
	}

	public void setG(double Ge) {
		this.Ge = Ge;
	}

	public double getGr() {
		return Gr;
	}

	public void setGr(double Gr) {
		this.Gr = Gr;
	}

}
