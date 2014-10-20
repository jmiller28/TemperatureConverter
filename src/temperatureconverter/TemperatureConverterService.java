package temperatureconverter;

import java.text.NumberFormat;

/**
 *
 * @author jmiller
 */
public class TemperatureConverterService {

    NumberFormat nf = NumberFormat.getInstance();

    public double getCelsiusFromFahrenheit(double fahrenheit) throws NumberFormatException {
        return (fahrenheit - 32) * 5 / 9;
    }

    public String getCelsiusFromFahrenheit(String fahrenheit) throws NumberFormatException {
        double f = Double.valueOf(fahrenheit);
        double c = (f - 32) * 5 / 9;
        nf.setMaximumFractionDigits(0);
        return String.valueOf(nf.format(c));
    }

    public String getFahrenheitFromCelsius(String celsius) throws NumberFormatException {
        double c = Double.valueOf(celsius);
        double f = ((c * 9 / 5) + 32);
        nf.setMaximumFractionDigits(0);
        return String.valueOf(nf.format(f));
    }
}
