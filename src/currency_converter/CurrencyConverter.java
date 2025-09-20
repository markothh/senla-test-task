package currency_converter;

import java.util.HashMap;

public class CurrencyConverter {
    private HashMap<String, Double> rates = new HashMap<>();

    public CurrencyConverter() {
        rates.put("USD", 0.012);
        rates.put("EUR", 0.01);
        rates.put("AED", 0.044);
        rates.put("GEL", 0.032);
        rates.put("NOK", 0.12);
    }

    public HashMap<String, Double> convert(Double value) {
        HashMap<String, Double> result = new HashMap<>();
        for (String currency : rates.keySet()) {
            result.put(currency, value * rates.get(currency));
        }

        return result;
    }
}
