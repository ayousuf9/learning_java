
public class ForLoop2Prime {
    public static void main(String[] args) {
       int primeNumberFound=0;
       for(int i=10; i<50; i++) {
           if(primeNumberFound == 10) {
               break;
           }
           if(isPrime(i)) {
           System.out.println(i + " Is prime number"); 
           primeNumberFound++;
           }
       } 
    }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
