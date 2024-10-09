public abstract class semaphore {

    protected int valeur=0;

    protected semaphore (int valeurInitiale){
	valeur = valeurInitiale>0 ? valeurInitiale:0;
    }

    public synchronized void syncWait(){
	try {
	    while(valeur<=0){
            wait();
        }
	    valeur--;  // elle peut être négatif si il y a plusieurs personnes qui arrivent
	} catch(InterruptedException e){}
    }

    public synchronized void syncSignal(){
	if(++valeur > 0) notifyAll();  // incrémente valeur. notifyAll met tout le monde prêt à l'exécution
    }
}
