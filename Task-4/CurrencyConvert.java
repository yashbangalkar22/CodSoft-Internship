import java.util.*;

class CurrencyConverter {
    private Map<String, Double> rates;

    public CurrencyConverter() {
        rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("INR", 83.0);
        rates.put("EUR", 0.9);
        rates.put("GBP", 0.8);
    }

    public double convert(String from, String to, double amount) {
        if (!rates.containsKey(from) || !rates.containsKey(to)) {
            System.out.println("Invalid Currency!");
            return 0;
        }
        double usdAmount = amount / rates.get(from);
        return usdAmount * rates.get(to);
    }
}

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.print("From Currency (USD/INR/EUR/GBP): ");
        String from = sc.next().toUpperCase();

        System.out.print("To Currency: ");
        String to = sc.next().toUpperCase();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        double result = converter.convert(from, to, amount);

        System.out.println("Converted Amount: " + result + " " + to);
    }
}