public class Bal {
    private String letter;

    public Bal() {
        this.letter = null;
    }


    public synchronized void depos(String lettreADeposer){
        try {
            while (letter != null) {
                wait();
            }
            letter = lettreADeposer;
            System.out.println("Le producteur a déposé la lettre intitulé : " + lettreADeposer);
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
    public synchronized void retrait(){
        try {
            while (letter == null) {
                wait();
            }
            System.out.println("Votre boite aux lettres contient la lettre suivante : " + letter);
            letter = null;
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
