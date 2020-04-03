import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
 
      
   public static void main(String[] test) {
  
     final ServerSocket serveurSocket  ;
     final Socket clientSocket ;
     final BufferedReader in;
     final PrintWriter out;
     final Scanner sc=new Scanner(System.in);
     final String choice;
     final String ch;
  
     try {
       serveurSocket = new ServerSocket(8080);
       clientSocket = serveurSocket.accept();
       out = new PrintWriter(clientSocket.getOutputStream());
       in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream()));
       Thread envoi= new Thread(new Runnable() {
          String msg;
          @Override
          public void run() {
             while(true){
                msg = sc.nextLine();
                out.println(msg);
                out.flush();
             }
          }
       });
       envoi.start();
   
       Thread recevoir= new Thread(new Runnable() {
          String msg ;
	  String choice;
	  String id;
          @Override
          public void run() {
             try {
                msg = in.readLine();
                //tant que le client est connecté
                while(msg!=null){
                   System.out.println(msg);
                   msg = in.readLine();
                   if(msg.equals("help")){
	           	do{
		      	 System.out.println("salut");
			 System.out.println("salut");
     			 System.out.println("salut");
			 System.out.println("salut");
			 id=in.readLine();
                     	}while(!choice.equals("q"));
		   }
                }
                //sortir de la boucle si le client a déconnecté
                System.out.println("Client déconecté");
                //fermer le flux et la session socket
                out.close();
                clientSocket.close();
                serveurSocket.close();
             } catch (IOException e) {
                  e.printStackTrace();
             }
         }
      });
      recevoir.start();
      }catch (IOException e) {
         e.printStackTrace();
      }
   }
}