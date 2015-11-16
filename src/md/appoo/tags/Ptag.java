package md.appoo.tags;

/**
 * @author luchfilip
 */
public class Ptag {

    /*
    * Method which sets <p> tags
    * */
    public static String setPtag(String line) {
        char firstChar = line.charAt(0);
        if (Character.isLetter(firstChar)) {
            line = "<p>" + line + "</p>";
        }
        return line;
    }
}
