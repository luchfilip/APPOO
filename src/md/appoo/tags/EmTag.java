package md.appoo.tags;

/**
 * @author luchfilip
 */
public class EmTag {

    /*
        * Method which sets <em> tags
        * */
    public static String setEmTag(String parsedLine) {
        if (parsedLine.contains("*")) {
            boolean isEmOpen = false;
            while (parsedLine.contains("*")) {
                int emPosition = parsedLine.indexOf("*");

                if (isEmOpen) {
                    parsedLine = parsedLine.substring(0, emPosition) +
                            "</em>" + parsedLine.substring(emPosition+1);
                    isEmOpen = false;
                } else {
                    parsedLine = parsedLine.substring(0, emPosition) +
                            "<em>" + parsedLine.substring(emPosition+1);
                    isEmOpen = true;
                }
            }
        }
        return parsedLine;
    }
}
