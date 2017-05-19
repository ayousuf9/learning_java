

public class ForLoop {
    public static void main(String[] args) {
        for (int i=2; i<9; i++) {
            System.out.println("Interest on 10000 at the rate of " + i + "% is: " + CalculateInterest(10000, i));
        }
        System.out.println();
        for (int i=8; i>=2; i--) {
            System.out.println("Interest on 10000 at the rate of " + i + "% is: " + CalculateInterest(10000, i));
        }
    }

    public static double CalculateInterest(double Amt, double Int) {
        return(Amt * Int/100);
    }
}
