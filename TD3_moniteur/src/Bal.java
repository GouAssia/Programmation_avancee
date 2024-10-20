public class Bal {
    private String letter;
    private boolean available = false;

    public Bal() {
    }

    public synchronized void depos(String lettreADeposer){
        try {
            while (available) {
                wait();
            }
            letter = lettreADeposer;
            available = true;
            System.out.println("Le producteur a déposé la lettre intitulé : " + lettreADeposer);
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
    public synchronized String retrait() {
        try {
            while (!available) {
                wait();
            }
            String lettreRetiree = letter;
            System.out.println("Votre boite aux lettres contient la lettre suivante : " + letter);
            letter = null;
            available = false;
            notify();
            return lettreRetiree;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
