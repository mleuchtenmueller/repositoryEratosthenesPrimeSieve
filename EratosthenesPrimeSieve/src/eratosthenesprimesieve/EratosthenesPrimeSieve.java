package eratosthenesprimesieve;

/**
 *
 * @author Moritz
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    /**
     * @param args the command line arguments
     */
    private int oG;

    public EratosthenesPrimeSieve(int oG) {
        this.oG = oG;
    }

    private boolean[] primeList = new boolean[oG];

    public void fillPrimeList() {
        for (int i = 0; i < primeList.length; i++) {
            primeList[i] = true;
        }
    }

    @Override
    public boolean isPrime(int p) {
        return true;
    }

    @Override
    public void printPrimes() {

    }
}
