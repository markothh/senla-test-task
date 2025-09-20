package currency_converter;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double valueToConvert;
        try {
            System.out.print("Введите сумму для конвертации (в рублях): ");
            Scanner scanner = new Scanner(System.in);
            valueToConvert = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Введено некорректное значение валюты");
            return;
        }

        CurrencyConverter currencyConverter = new CurrencyConverter();
        HashMap<String, Double> convertedCurrencies = currencyConverter.convert(valueToConvert);

        System.out.printf("%.2f рублей конвертированы в следующие валюты:\n", valueToConvert);
        for (String currency : convertedCurrencies.keySet()) {
            System.out.printf("%s: %.2f\n", currency, convertedCurrencies.get(currency));
        }
    }
}
