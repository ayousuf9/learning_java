public class IsEvenNumber {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 20;
        int totalEvenNumbersFound = 0;
        while(startNumber <= endNumber) {
            if (isEven(startNumber)) {
                System.out.println(startNumber + " is even number");
                startNumber++;
                totalEvenNumbersFound++;
                if (totalEvenNumbersFound >= 5) {
                    System.out.println("Total even numbers found = " + totalEvenNumbersFound);
                    break;
                }
            }
            else {
                System.out.println(startNumber + " is not even number");
                startNumber++;
            }
        }
    } 
    public static boolean isEven(int aNumber) {
        if ( (aNumber % 2) == 0 ) {
            return true;
        } else {
        return false;
        }
    }
}
