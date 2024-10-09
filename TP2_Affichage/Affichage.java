/**
 * 
 */
import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;
import java.util.concurrent.Semaphore;

/*public class Affichage extends Thread{
	String texte;

	public Affichage (String txt){texte=txt;}
	
	public void run(){
		synchronized (System.out){
			for (int i=0; i<texte.length(); i++){
				System.out.print(texte.charAt(i));
				try {sleep(100);} catch(InterruptedException e){};
			}
		}
	}
}*/

public class Affichage extends Thread{
	String texte;
	semaphoreBinaire sem;

	public Affichage (String txt, semaphoreBinaire sem){
		texte=txt;
		this.sem = sem;
	}

	public void run(){
		this.sem.syncWait();
			for (int i=0; i<texte.length(); i++){
				System.out.print(texte.charAt(i));
				try {sleep(100);} catch(InterruptedException e){};
			}
			this.sem.syncSignal();
		}
	}
