package userfunctions.functions;

//import org.teiid.query.util.CommandContext;

public class TempConv 
{
   /**
   * Converts the given Celsius temperature to Fahrenheit, and returns the
   * value.
   * @param doubleCelsiusTemp 
   * @return Fahrenheit 
   */
	// CommandContext context,
   public static Double celsiusToFahrenheit(Double doubleCelsiusTemp)
   {
      if (doubleCelsiusTemp == null) 
      {
         return null;
      }
      return (doubleCelsiusTemp)*9/5 + 32;
   }
}