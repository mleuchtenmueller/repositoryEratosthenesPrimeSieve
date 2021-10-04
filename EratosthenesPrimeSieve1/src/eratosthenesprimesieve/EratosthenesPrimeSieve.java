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

    public void fillPrimeList() {                       //initializes every index in the boolean array to true
        for (int i = 2; i < boolPrimeList.length; i++) {
            boolPrimeList[i] = true;
        }
    }

    @Override
    public boolean isPrime(int p) {                     //Checks if the param is a prime and uses the pram as upper Limit and fills the boolean Array with true if the number at that index is a prime.
        for (int i = 2; i < boolPrimeList.length; i++) {
            if (boolPrimeList[i]) {
                int x = i * i;
                for (int j = 0; j <= uL; j++) {
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
    public void printPrimes() {                         //Prints all values set to true in the boolean array
        for (int i = 0; i < boolPrimeList.length; i++) {
            if (boolPrimeList[i]) {
                System.out.print(i);
            }
            if (i < boolPrimeList.length - 2 && boolPrimeList[i]) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    public void aufgabe2() {                            //Searches for all even numbers up to the upper Limit and divides every even number into two primes
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < boolPrimeList.length; i++) {
            if (boolPrimeList[i]) {
                primes.add(i);
            }
        }
        for (int i = 4; i <= uL; i = i + 2) {
            evenNumbers.add(i);
        }

        for (int i = 0; i < evenNumbers.size(); i++) {
            int biggestPrime = primes.get(1);
            for (int j = 0; j <= primes.size() - 1; j++) {
                if (evenNumbers.get(i) >= primes.get(j) + primes.get(0)) {
                    biggestPrime = primes.get(j);
                }
            }
            System.out.println(evenNumbers.get(i) + " summe: " + evenNumbers.get(i) + " = " + (evenNumbers.get(i) - (biggestPrime)) + " + " + biggestPrime);
        }
    }
}
