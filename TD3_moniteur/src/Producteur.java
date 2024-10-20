import java.util.Scanner;

public class Producteur extends Thread {
    private Bal bal;

    public Producteur(Bal bal) {
        this.bal = bal;
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String lettreADeposer;

        while (true) {
            System.out.print("Entrez la lettre à déposer (ou 'Q' pour quitter) : ");
            lettreADeposer = scanner.nextLine();

            if (lettreADeposer.equalsIgnoreCase("Q")) {
                System.out.println("Le producteur s'arrête.");
                bal.depos(lettreADeposer); // Dépose 'Q' dans la BAL
                break;
            }
            bal.depos(lettreADeposer);
            try {
                Thread.sleep(1000); // Simule le temps de production
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        scanner.close();
    }
}
