package eratosthenesprimesieve;

import java.util.*;

/**
 *
 * @author Moritz
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    /**
     * @param args the command line arguments
     */
    private int uL;

    public EratosthenesPrimeSieve(int uL) {
        this.uL = uL;
    }

    public boolean[] boolPrimeList = new boolean[uL];

    public void fillPrimeList() {
        for (int i = 2; i < boolPrimeList.length; i++) {
            boolPrimeList[i] = true;
        }
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i < boolPrimeList.length; i++) {
            if (boolPrimeList[i]) {
                int x = i * i;
                for (int j = 0; j < uL; j++) {
                    if (x == j) {
                        boolPrimeList[j] = false;
                        x = x + i;
                    }
                }
            }
        }
        return boolPrimeList[p];
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < boolPrimeList.length; i++) {
            if (boolPrimeList[i]) {
                System.out.print(i);
            }
            if (i < boolPrimeList.length - 1 && boolPrimeList[i]) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    //Augabe 2
    public void aufgabe2() {
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < boolPrimeList.length; i++) {
            if (boolPrimeList[i]) {
                primes.add(i);
            }
        }
        for (int i = 4; i < uL; i = i + 2) {
            evenNumbers.add(i);
        }

        for (int i = 0; i < evenNumbers.size(); i++) {
            int index = primes.size() - 1;
            int biggestPrime = primes.get(primes.size() - 1);
            if ((biggestPrime - 2) <= (evenNumbers.get(i))) {
                System.out.println(uL + ": " + biggestPrime + "+" + (evenNumbers.get(i) - (biggestPrime)));
            }
        }

    }
}
