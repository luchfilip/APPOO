package md.appoo.parser;

import md.appoo.tags.*;

/**
 * @author luchfilip
 */
public class Line {

    /*
    * Method which parses a line
    * */
    public static String parseLine(String line) {
        String parsedLine = "";

        if (line.length()>0) {
            parsedLine = line;
//			set <p> tags if first char is letter
            parsedLine = Ptag.setPtag(parsedLine);

            // check for # and set <h> tags if exists
            parsedLine = Htag.setHtag(parsedLine);

            // set <strong> tags if exists
            parsedLine = StrongTag.setStrongTag(parsedLine);

            // set <em> tags if exists
            parsedLine = EmTag.setEmTag(parsedLine);

            // set <code> tags if exists
            parsedLine = CodeTag.setCodeTag(parsedLine);

            // set url tag if exists
            parsedLine = UrlTag.setUrlTag(parsedLine);
        }

        parsedLine += "\n";

        return parsedLine;
    }

}
