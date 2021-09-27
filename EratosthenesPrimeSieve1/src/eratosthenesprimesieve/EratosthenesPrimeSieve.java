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

    public void main()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("1...check if a number is a prime number");
      System.out.println("2...Show all prime numbers up to the upper limit");
      System.out.println("3...Find 2 prime numbers for each even natural number");
      int input = Integer.parseInt(scanner.nextLine());
      if(input == 1)
      {
        isPrime(int n);
      }
      else if(input == 2)
      {
        printPrimes();
      }
      else if(input == 3)
      {
         aufgabe2();
      }
    }

    private boolean[] boolPrimeList = new boolean[uL];

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
                for (int j = 0; j < oG; j++) {
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
        for(int i = 0; i < boolPrimeList.length; i++)
        {
            if(boolPrimeList[i])
            {
              System.out.println(i);
            }
        }
    }

    //Augabe 2
    public void aufgabe2(){
    List<int> primes = new ArrayList<int>();

        for(int i = 0; i < boolPrimeList.length; i++)
        {
            if(boolPrimeList[i])
            {
                primes.add(i);
            }
        }

    }
}
