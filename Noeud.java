public class Noeud{
	private String IpAdresse;
	private int NbLiaison;
	private int NumPort;
	
    public String getIpAdresse(){
        return IpAdresse;
    }
    
    
    public void setIpAdresse(String IpAdresse){
        this.IpAdresse = IpAdresse;
    }
    
    public int getNbLiaison() {
		return NbLiaison;
	}
    
	public void setLiaison(int NbLiason){
		this.NbLiaison= NbLiason;
	}
	
    public int getNumPort() {
		return NumPort;
	}
    
	public void setNumPort(int NumPort) {
		this.NumPort = NumPort;
	}
	
    
	public Noeud(String IpAdresse,int NbLiaison, int NumPort){
			this.IpAdresse= IpAdresse;
			this.NbLiaison= NbLiaison;
            this.NumPort= NumPort;
			
	}
}