public class Noeuds{
	private String IpAdresse;
	private int NbLiason;
	private int NumPort;
	//constructeur
	
	public int NbLiason() {
		return NbLiason;
	}
	
	public void setLiaison(int NbLiason){
		this.NbLiason= NbLiason;
	}
	
	public int getPort() {
		return NumPort;
	}
	
	public void setPort(int NumPort){
		this.NumPort= NumPort;
	}
	
	public Noeuds(String ip, int port, int nb){
			IpAdresse=ip;
			NumPort=port;
			NbLiason=nb;
	}
}
