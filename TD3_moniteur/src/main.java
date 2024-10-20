public class main {

    public static void main(String[] args) {
        Bal bal = new Bal();
        Producteur producteur = new Producteur(bal);
        Consommateur consommateur = new Consommateur(bal);

        producteur.start();
        consommateur.start();

    }
}
