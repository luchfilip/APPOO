package md.appoo.tags;

/**
 * @author luchfilip
 */
public class StrongTag {

    /*
    * Method which sets <strong> tags
    * */
    public static String setStrongTag(String parsedLine) {
        if (parsedLine.contains("**")) {
            boolean isStrongOpen = false;
            while (parsedLine.contains("**")) {
                int strongPosition = parsedLine.indexOf("**");

                if (isStrongOpen) {
                    parsedLine = parsedLine.substring(0, strongPosition) +
                            "</strong>" + parsedLine.substring(strongPosition+2);
                    isStrongOpen = false;
                } else {
                    parsedLine = parsedLine.substring(0, strongPosition) +
                            "<strong>" + parsedLine.substring(strongPosition+2);
                    isStrongOpen = true;
                }
            }
        }
        return parsedLine;
    }
}
