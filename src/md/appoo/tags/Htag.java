package md.appoo.tags;

import md.appoo.utils.Utils;

/**
 * @author luchfilip
 */
public class Htag {

    /*
    * Method which sets <h> tags
    * */
    public static String setHtag(String line) {
         if (line.contains("#")) {
             if (line.indexOf("#") == 0) {
                 int hashTagCount = Utils.countSameChar(line, '#');

                 line = line.replace(line.substring(0, hashTagCount),
                         "<h"+ hashTagCount + ">") +
                         "</h"+ hashTagCount + ">";
             }
         }
        if (line.contains("##")) {
            line = line.replace("##", "");
            line = "<h2>" +
                    line +
                    "</h2>";
        }
     return line;
 }
}
