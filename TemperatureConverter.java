import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        
        System.out.print("Enter temperature unit (C or F): ");
        char unit = scanner.next().charAt(0);

       
        if (unit == 'C' || unit == 'c') {
            double convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
       
}

else {
            System.out.println("Invalid temperature unit. Please enter C or F.");
        }

        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}