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
        for (int i = 2; i < primeList.length; i++) {
            primeList[i] = true;
        }
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i < primeList.length; i++) {
            if (primeList[i]) {
                int x = i * i;
                for (int j = 0; j < oG; j++) {
                    if (x == j) {
                        primeList[j] = false;
                        x = x + i;
                    }
                }
            }
        }
        return primeList[p];
    }

    @Override
    public void printPrimes() {

    }
}
