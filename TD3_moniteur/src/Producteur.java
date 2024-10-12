public class Producteur extends Thread {
    private Bal bal;
    private String LettreADeposer;

    public Producteur(Bal bal, String lettreADeposer) {
        this.bal = bal;
        this.LettreADeposer = lettreADeposer;
    }

    public void run() {
        try {
            bal.depos(LettreADeposer);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
