import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner (System.in);

        double carMPG = 0.0;
        double carGallons = 0.0;
        double gasPercentage = 0.0;
        double rawRange = 0.0;

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        carMPG = scnr.nextDouble();

        if (carMPG <= 0.0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!");
            return;
        }

          else  {
            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        }

        carGallons = scnr.nextDouble();

        if (carGallons <= 0.0) {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ARE ACCEPTED FOR TANK CAPACITY!!");
            return;
        }

        else  {
                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%: ");
            }

            gasPercentage = scnr.nextDouble();

        if ((gasPercentage < 0) || (gasPercentage > 100)) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100% (INCLUSIVE)!!!");
            return;
        }

        else {
            rawRange = (carMPG * carGallons * (gasPercentage * 0.01));
            rawRange = Math.round(rawRange);
            System.out.println("Miles left in range is:  " + rawRange);

        }

        if (rawRange <= 25) {
            System.out.println("Attention! Your current estimated range is running low!!");
        }

        else {
            System.out.println("Keep driving! Your current estimated range is: " + rawRange + "miles");
        }


















    }
}
