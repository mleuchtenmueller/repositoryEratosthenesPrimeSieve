package eratosthenesprimesieve;

/**
 *
 * @author Moritz
 */
public interface PrimeSieve {

    //Überprüft ob p eine Primzahl ist
    public boolean isPrime(int p);

    //Gibt alle Primzahlen bis zur Obergränze aus
    public void printPrimes();
}
