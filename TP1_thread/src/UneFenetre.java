import java.awt.*;
import javax.swing.*;

class UneFenetre extends JFrame 
{
    UnMobile sonMobile;
    private final int LARG=400, HAUT=250;
    
    public UneFenetre()
    {
	// TODO
        super("le Mobile");
        Container container = getContentPane();
        sonMobile = new UnMobile(400,250);sonMobile = new UnMobile(400,250); // ajouter sonMobile a la fenetre
        container.add(sonMobile);
        Thread laTache = new Thread(sonMobile); // creer une thread laThread avec sonMobile
	    // afficher la fenetre
        laTache.start(); // lancer laThread
        setSize(LARG, HAUT);
        setVisible(true);
    }
}
