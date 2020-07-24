import java.util.*;

public class Main {
   public static void main(String args[]) {

      // Create a currency for GERMANY locale
      Locale locale = Locale.GERMANY;
      Currency cur1 = Currency.getInstance(locale);

      // Get and print the symbol of the currency
      String symbol = cur1.getSymbol(locale);
      System.out.println("Currency symbol is = " + symbol);
	 // System.out.println(DecimalFormat.getCurrencyInstance().format( 123.45) );
System.out.println(DecimalFormat.getCurrencyInstance(Locale.US).format( $123.45)) ;
   }
}