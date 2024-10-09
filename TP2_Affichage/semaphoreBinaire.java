
public final class semaphoreBinaire extends semaphore {
public semaphoreBinaire(int valeurInitiale){
	super((valeurInitiale != 0) ? 1:0);   //si la valeur initiale est différent de 0 alors la valeur est 1 sinon 0
	//System.out.print(valeurInitiale);
}
public final synchronized void syncSignal(){  // quand on sort ca veut dire que la valeur 1 dit qu'on libère l'espace et 0 qu'il y a quelqu'un
	super.syncSignal();
	//System.out.print(valeur);
	if (valeur>1) valeur = 1;
}
}

