package sol;
import java.util.LinkedList;
import java.util.regex.Matcher ;
import java.util.regex.Pattern ;

public class RegexMatcher {

    /**
     *
     * return the result (a space separated String) of the second String
     * applied as a regex to the first String.
     * @param input -- first string we are inputting
     * @param regex -- Second string we are inputting
     * @return result (a space separated String) of the second String
     * applied as a regex to the first String.
     */
    public static String regexifier(String input, String regex){

        if (input == null ||  regex == null ) {
            return "";
        }

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        String store = "";

        while(m.find()) {
            store += " " + (m.group());
        }

        return store.trim();


    }

    public static String brownEmails(String str){

    }

}
