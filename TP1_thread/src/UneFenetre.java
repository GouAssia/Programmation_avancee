import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

class UneFenetre extends JFrame {
    /*UnMobile sonMobile;
    Button sonBouton;*/
    private ArrayList<UnMobile> mobiles;
    private ArrayList<Thread> threads;
    private final int LARG = 600, HAUT = 400;


    public UneFenetre() {
        // TODO
        super("le Mobile");

        mobiles = new ArrayList<>();
        threads = new ArrayList<>();

        Container container = getContentPane();
        container.setLayout(new GridLayout(6,1));

        for (int i = 0; i < 6; i++) {

            mobiles.add(new UnMobile(LARG, HAUT/6));
            container.add(mobiles.get(i));
            Thread latache = new Thread(mobiles.get(i));
            threads.add(latache);
            latache.start();

        }
        setSize(LARG, HAUT);
        setVisible(true);

     /* Créer un thread pour chaque mobile
        //Thread laTache = new Thread(sonMobile);
          threads.add(laTache);
          laTache.start(); // Lancer le thread*/
        /*UnMobile sonMobile = new UnMobile(600, 400);
        sonBouton = new Button("START/STOP");
        container.add(sonBouton, BorderLayout.SOUTH);

        sonBouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(laTache.getState() == Thread.State.TIMED_WAITING){
                    laTache.suspend();
                }else{
                    laTache.resume();
                }

            }
        });*/
    }
}
