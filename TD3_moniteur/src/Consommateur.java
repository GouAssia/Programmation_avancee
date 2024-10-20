public class Consommateur extends Thread {
    private Bal bal;

    public Consommateur(Bal bal) {
        this.bal = bal;
    }

    public void run() {
        while (true) {
            String lettreRetiree = bal.retrait();

            if (lettreRetiree.equalsIgnoreCase("Q")) {
                System.out.println("Le consommateur s'arrête.");
                break;
            }

            try {
                Thread.sleep(1000); // Simule le temps de consommation
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
