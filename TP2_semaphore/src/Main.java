import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        semaphoreBinaire sem = new semaphoreBinaire(1);
        Affichage TA = new Affichage("AAA", sem);
        Affichage TB = new Affichage("BB", sem);
        Affichage TC = new Affichage("C", sem);
        Affichage TD = new Affichage("DDDDD", sem);

        TB.start();
        TA.start();
        TD.start();
        TC.start();

    }

}
