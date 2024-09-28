import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class UneFenetre extends JFrame {
    UnMobile sonMobile;
    Button sonBouton;
    private final int LARG = 600, HAUT = 400;

    public UneFenetre() {
        // TODO
        super("le Mobile");
        Container container = getContentPane();
        sonMobile = new UnMobile(600, 400);// ajouter sonMobile a la fenetre
        container.add(sonMobile);
        Thread laTache = new Thread(sonMobile); // creer une thread laThread avec sonMobile
        // afficher la fenetre
        laTache.start(); // lancer laThread
        setSize(LARG, HAUT);
        setVisible(true);

        sonBouton = new Button("START/STOP");
        container.add(sonBouton, BorderLayout.SOUTH);

        sonBouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(laTache.getState() == Thread.State.RUNNABLE){
                    
                }

            }
        });
    }
}
