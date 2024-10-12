public class main {

    public static void main(String[] args) {
        Bal bal = new Bal();
        Producteur producteur = new Producteur(bal, "Salut c'est Assia !!");
        Consommateur consommateur = new Consommateur(bal);

        producteur.start();
        consommateur.start();

    }
}
