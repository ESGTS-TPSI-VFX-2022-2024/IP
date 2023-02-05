import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numYears = 0;
        BigDecimal[] values = new BigDecimal[5];
        BigDecimal[] interestRates = new BigDecimal[5];
        BigDecimal[] simpleInterest = new BigDecimal[5];
        BigDecimal[] compoundInterest = new BigDecimal[5];

        System.out.println("Enter the number of years:");
        numYears = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter 5 values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextBigDecimal();
        }
        
        System.out.println("Enter 5 interest rates:");
        for (int i = 0; i < interestRates.length; i++) {
            interestRates[i] = scanner.nextBigDecimal();
        }
        
        for (int i = 0; i < values.length; i++) {
            simpleInterest[i] = values[i].multiply(interestRates[i].divide(new BigDecimal(100))).multiply(new BigDecimal(numYears)).add(values[i]);
            compoundInterest[i] = values[i].multiply(BigDecimal.ONE.add(interestRates[i].divide(new BigDecimal(100))).pow(numYears)).add(values[i]);
        }
        
        System.out.println("Simple Interest Results:");
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value " + (i + 1) + ": " + simpleInterest[i].setScale(2, RoundingMode.HALF_UP));
        }
        
        System.out.println("Compound Interest Results:");
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value " + (i + 1) + ": " + compoundInterest[i].setScale(2, RoundingMode.HALF_UP));
        }
    }
}