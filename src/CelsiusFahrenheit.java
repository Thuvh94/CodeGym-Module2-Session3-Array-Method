import java.util.Scanner;
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        double inputCelsius;
        double inputFahrenheit;
        do {

            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter option you want:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a Fahrenheit");
                    inputFahrenheit = input.nextDouble();
                    System.out.printf("%.2f Fahrenheit = %5.2f celsius%n",inputFahrenheit,fahrenheitToCelsius(inputFahrenheit));
                    break;
                case 2:
                    System.out.println("Enter a Celsius");
                    inputCelsius = input.nextDouble();
                    System.out.printf("%.2f Celsius = %5.2f Fahrenheit%n",inputCelsius,celsiusToFahrenheit(inputCelsius));
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
            }
        }
        while (choice != 0);
    }
    public static double fahrenheitToCelsius(double fah){
        double outputCelsius = (5.0 / 9) * (fah - 32);
        return outputCelsius;
    }

    public static double celsiusToFahrenheit(double cel){
        double outputFahrenheit = (9.0 / 5) * cel + 32;
        return outputFahrenheit;
    }
}