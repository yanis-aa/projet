public class Pylone {
	private String Id;
	private String Ip;
	private int Port;
	private double Latitude;
	private double Longitude;
	
	public String getId(){
		return Id;
	}
	public void setId(String Id) {
		this.Id= Id;
	}
	
	public String getIp(){
		return Ip;
	}
	public void setIp(String Ip) {
		this.Ip= Ip;
	}
	
	
	public int getPort() {
		return Port;
    }
    public void setPort(int Port) {
        this.Port = Port;
    }
    
     public double getLatitude() {
        return Latitude;
    }
    public void setLatitude(double Latitude) {
		this.Latitude = Latitude;
	}
    
    public double getLongitude() {
	        return Longitude;
	    }
	public void setLongitude(double Longitude) {
		this.Longitude = Longitude;
		
	}
	public Pylone(String Id, String Ip,  int Port, double Latitude, double Longitude){
		this.Id= Id;
		this.Ip= Ip;
		this.Port= Port;
		this.Latitude= Latitude;
		this.Longitude=Longitude;
       
		
	}
	
}