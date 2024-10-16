import java.awt.*;
import javax.swing.*;

class UnMobile extends JPanel implements Runnable
{
    int saLargeur, saHauteur, sonDebDessin;
    final int sonPas = 20, sonCote=40;
	final int sonTemps = (int) Math.floor(Math.random() * 60) + 1;
	semaphoreGenerale semaphoreGenerale;
    
    UnMobile(int telleLargeur, int telleHauteur, semaphoreGenerale sem)
    {
	super();
	saLargeur = telleLargeur;
	saHauteur = telleHauteur;
	setSize(telleLargeur, telleHauteur);
	this.semaphoreGenerale = sem;
    }

	public void run()
	{
		while (true){
			for (sonDebDessin = 0; sonDebDessin + sonCote < (saLargeur/3) - sonPas; sonDebDessin += sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}
			semaphoreGenerale.syncWait();
			for (; sonDebDessin + sonCote < (saLargeur/3)*2 - sonPas; sonDebDessin += sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}
			semaphoreGenerale.syncSignal();
			for (; sonDebDessin + sonCote < saLargeur - sonPas; sonDebDessin += sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}
			for (; sonDebDessin > (saLargeur/3)*2-sonPas; sonDebDessin -= sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}
			semaphoreGenerale.syncWait();
			for (; sonDebDessin > (saLargeur/3)-sonPas; sonDebDessin -= sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}
			semaphoreGenerale.syncSignal();
			for (; sonDebDessin > -sonPas; sonDebDessin -= sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}
		}
	}

    public void paintComponent(Graphics telCG)
    {
	super.paintComponent(telCG);
	telCG.fillRect(sonDebDessin, saHauteur/2, sonCote, sonCote);
    }
}