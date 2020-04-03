public class Affiche{
	



	
public static  void main (String [] args ) {

	String ip1="10.1.0.1";
	String ip2="10.1.0.2";
	String ip3="10.1.0.3";
	String ip4="10.1.0.100";
	String ip5="10.1.0.101";
	String ip6="10.1.0.102";
	
Noeud noeud1=new Noeud(ip1, 3, 130);
Noeud noeud2=new Noeud(ip2, 6, 130);
Noeud noeud3=new Noeud(ip3, 3, 130);

Pylone pylone1=new Pylone( "P001", ip4,  50, 130.2, 25.1);
Pylone pylone2=new Pylone("P002", ip5, 50, 130.4, 76.6);
Pylone pylone3=new Pylone("P003", ip6, 50, 80.5, 150.5);

Antenne antenne1=new Antenne(-20.3, 30.5, 2000.00, -30.1, "horizontal", -3.4, -5.5 );
Antenne antenne2=new Antenne(-10, 15, 5050, -35, "horizontal", -60, -10 );
Antenne antenne3=new Antenne(-5, 20, 3000, -25, "vertical", -18, -7 );

                                          

//pour afficher les caractéristiques d'un noeud

System.out.println("Les caractèristiques du noeud 1 sont :" );

System.out.println("Adresse Ip : "+ noeud1.getIpAdresse());
System.out.println("Nombre de liaison : "+noeud1.getNbLiaison());
System.out.println("Numéros du port : "+noeud1.getNumPort());
System.out.println(" ");

    
System.out.println("Les caractèristiques du noeud 2 sont :" );

System.out.println("Adresse Ip : "+noeud2.getIpAdresse());
System.out.println("Nombre de liaison : "+noeud2.getNbLiaison());
System.out.println("Numéros du port : "+noeud2.getNumPort());
System.out.println(" ");


System.out.println("Les caractèristiques du noeud 3 sont :" );

System.out.println("Adresse Ip : "+noeud3.getIpAdresse());
System.out.println("Nombre de liaison : "+noeud3.getNbLiaison());
System.out.println("Numéros du port : "+noeud3.getNumPort());
System.out.println(" ");


	
			
	
		                                          

	//pour afficher les caractéristiques d'un Pylone

	System.out.println("Les caractèristiques du pylone 1 sont :" );
	System.out.println("Id : "+ pylone1.getId());
	System.out.println("Adresse Ip : "+ pylone1.getIp());
	System.out.println("Numero de port : "+pylone1.getPort());
	System.out.println("Latitude : "+pylone1.getLatitude()+"°");
	System.out.println("Longitude : "+pylone1.getLongitude()+"°");
	System.out.println(" ");
		    
	System.out.println("Les caractèristiques du pylone 2 sont :" );
	System.out.println("Id : "+ pylone2.getId());
	System.out.println("Adresse Ip : "+ pylone2.getIp());
	System.out.println("Numero de port : "+pylone2.getPort());
	System.out.println("Latitude : "+pylone2.getLatitude()+"°");
	System.out.println("Longitude : "+pylone2.getLongitude()+"°");
	System.out.println(" ");
	
	
	System.out.println("Les caractèristiques du pylone 3 sont :" );
	System.out.println("Id : "+ pylone3.getId());
	System.out.println("Adresse Ip : "+ pylone3.getIp());
	System.out.println("Numero de port : "+pylone3.getPort());
	System.out.println("Latitude : "+pylone3.getLatitude()+"°");
	System.out.println("Longitude : "+pylone3.getLongitude()+"°");
	System.out.println(" ");
	
	
	
	//pour afficher les caractéristiques d'une antenne
	
	
	System.out.println("Les caractèristiques de l'antenne 1 sont :" );
	
	System.out.println("Puissance d'émision : "+antenne1.getPe());
	System.out.println("Fréquence : "+antenne1.getFrequence());
	System.out.println("Sensibilté : "+antenne1.getSensibilite());
	System.out.println("Polarisation : "+antenne1.getPolarisation());
	System.out.println("Orientation : "+antenne1.getOrientation());
	System.out.println("Ouverture : "+antenne1.getOuverture());
	System.out.println(" ");
	

	System.out.println("Les caractèristiques de l'antenne 2 sont :" );

	System.out.println("Puissance d'émision : "+antenne2.getPe());
	System.out.println("Fréquence : "+antenne2.getFrequence());
	System.out.println("Sensibilté : "+antenne2.getSensibilite());
	System.out.println("Polarisation : "+antenne2.getPolarisation());
	System.out.println("Orientation : "+antenne2.getOrientation());
	System.out.println("Ouverture : "+antenne2.getOuverture());
	System.out.println(" ");
	
	
	System.out.println("Les caractèristiques de l'antenne 3 sont :" );
	
	System.out.println("Puissance d'émision : "+antenne3.getPe());
	System.out.println("Fréquence : "+antenne3.getFrequence());
	System.out.println("Sensibilté : "+antenne3.getSensibilite());
	System.out.println("Polarisation : "+antenne3.getPolarisation());
	System.out.println("Orientation : "+antenne3.getOrientation());
	System.out.println("Ouverture : "+antenne3.getOuverture());
	System.out.println(" ");

	

	

	
	
	antenne1.Joindre(antenne2);
	if (antenne1.Joindre(antenne2)== "true") {
		System.out.println ("L'antenne 1 peut joindre l'antenne 2");
	}
	else {
			System.out.println("L'antenne 1 ne peut pas joindre lantenne 2");
	}
	
	
	antenne1.Joindre(antenne3);
	if (antenne1.Joindre(antenne3)== "true") {
		System.out.println ("L'antenne 1 peut joindre l'antenne 3");
	}
	else {
			System.out.println("L'antenne 1 ne peut pas joindre lantenne 3");
	}
	
	antenne2.Joindre(antenne1);
	if (antenne2.Joindre(antenne1)== "true") {
		System.out.println ("L'antenne 2 peut joindre l'antenne 1");
	}
	if(antenne2.Joindre(antenne1)== "false") {
			System.out.println("L'antenne 2 ne peut pas joindre lantenne 1");
	}
	antenne2.Joindre(antenne3);
	if (antenne2.Joindre(antenne3)== "true") {
		System.out.println ("L'antenne 2 peut joindre l'antenne 3");
	}
	if(antenne2.Joindre(antenne3)== "false") {
			System.out.println("L'antenne 2 ne peut pas joindre lantenne 3");
	}
	
	antenne3.Joindre(antenne1);
	if (antenne3.Joindre(antenne1)== "true") {
		System.out.println ("L'antenne 3 peut joindre l'antenne 1");
	}
	if(antenne3.Joindre(antenne1)== "false") {
			System.out.println("L'antenne 3 ne peut pas joindre lantenne 1");
	}
	
	
	antenne3.Joindre(antenne2);
	if (antenne3.Joindre(antenne2)== "true") {
		System.out.println ("L'antenne 3 peut joindre l'antenne 2");
	}
	if(antenne3.Joindre(antenne2)== "false") {
			System.out.println("L'antenne 3 ne peut pas joindre lantenne 2");
	}
	
}

	}






