package md.appoo.tags;

/**
 * @author luchfilip
 */
public class CodeTag {

    /*
    * Method which sets <code></code> tags
    * */
    public static String setCodeTag(String parsedLine) {
        if (parsedLine.contains("`")) {
            boolean isCodeOpen = false;
            while (parsedLine.contains("`")) {
                int codePosition = parsedLine.indexOf("`");

                if (isCodeOpen) {
                    parsedLine = parsedLine.substring(0, codePosition) +
                            "</code>" + parsedLine.substring(codePosition+1);
                    isCodeOpen = false;
                } else {
                    parsedLine = parsedLine.substring(0, codePosition) +
                            "<code>" + parsedLine.substring(codePosition+1);
                    isCodeOpen = true;
                }
            }
        }
        return parsedLine;
    }
}
