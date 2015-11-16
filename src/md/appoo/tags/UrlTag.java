package md.appoo.tags;

/**
 * @author luchfilip
 */
public class UrlTag {

    /*
    * Method which formats a hyperlink
    * */
    public static String setUrlTag(String parsedLine) {
        if (parsedLine.contains("[") && parsedLine.contains("]") &&
                parsedLine.contains("(") && parsedLine.contains(")")) {

            int linkTitleStartPos = parsedLine.indexOf("[");
            int linkTitleStopPos = parsedLine.indexOf("]");
            int linkUrlStartPos = parsedLine.indexOf("(");
            int linkUrlStopPos = parsedLine.indexOf(")");

            parsedLine = parsedLine.substring(0, linkTitleStartPos-1) +
                    " <a href=\"" +
                    parsedLine.substring(linkUrlStartPos+1, linkUrlStopPos) +
                    "\" rel=\"noreferrer\" class=\"hoverZoomLink\">" +
                    parsedLine.substring(linkTitleStartPos+1, linkTitleStopPos) +
                    "</a>" +
                    parsedLine.substring(linkUrlStopPos+1);
        }
        return parsedLine;
    }
}
