package eratosthenesprimesieve;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve(Integer.parseInt(args[0]));
        eratosthenesPrimeSieve.boolPrimeList = new boolean[Integer.parseInt(args[0]) + 1];
        eratosthenesPrimeSieve.fillPrimeList();
        if (eratosthenesPrimeSieve.isPrime(Integer.parseInt(args[0]))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        eratosthenesPrimeSieve.isPrime(Integer.parseInt(args[0]));
        eratosthenesPrimeSieve.printPrimes();
        eratosthenesPrimeSieve.aufgabe2();
    }
}
