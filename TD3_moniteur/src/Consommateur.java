public class Consommateur extends Thread{
    private Bal bal;

    public Consommateur(Bal bal) {
        this.bal = bal;
    }
    public void run() {
        try {
            bal.retrait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
