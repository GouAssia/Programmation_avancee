
public final class semaphoreGenerale extends sem {
    int valeurInitiale;
    public semaphoreGenerale(int valeurInitiale){
        super((valeurInitiale != 0) ? valeurInitiale:0);
        this.valeurInitiale = valeurInitiale;
    }
    public final synchronized void syncSignal(){
        super.syncSignal();
        if (valeur>valeurInitiale) valeur = valeurInitiale;
    }
}

