//Count the number of prime numbers less than a non-negative number, n.

public class CountPrimes{
  public static void main(String[] args) {
    System.out.println(countPrime(30));
    
  }
  public static int countPrime(int n){
    boolean[] primes = new boolean[n];  // every element is false, initially.

    for(int i=2;i*i<primes.length;i++){  // Using Sieve of eratosthenes
      if(!primes[i]){
        for(int j=i; i*j<primes.length;j++){
          primes[i*j] = true; // true if they are not prime numbers
        }
      }
    }
    int count=0;
      for(int i=2;i<primes.length;i++){
        if(!primes[i]){  // count the false cuz they are not divisible..
          count++;
        }
      }
      return count++;
  }
}