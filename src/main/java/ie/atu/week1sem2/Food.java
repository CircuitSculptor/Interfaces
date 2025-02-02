package ie.atu.week1sem2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface Food {
    String getName();
    double getPrice();
    String getDescription();

    /*
    // Experimental code for totalCost formatting
    default String getPriceFormatted() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(java.util.Locale.GERMANY);
        symbols.setDecimalSeparator('€');
        DecimalFormat formatter = new DecimalFormat("€ #,##0.00", symbols);
        return formatter.format(getPrice());
    }
    default String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.GERMANY);
        return currency.format(getPrice());
    }
    */
}
