import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * write and test a regular expression that checks a sentence to see
 * that it begins with a capital letter and ends with a period
 */
public class Regex {

     public static boolean test(String str)
     {
         Pattern p = Pattern.compile("[A-Z].*\\.");
         Matcher m = p.matcher(str);
         return m.matches();
     }

}
