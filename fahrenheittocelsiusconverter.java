package secondlab;
public class fahrenheittocelsiusconverter {

    public static void main(String[] args) {
        // Predefined Fahrenheit temperature
        double fahrenheit = 98.6;

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperature in Celsius: " + celsius + " °C");
    }
}

