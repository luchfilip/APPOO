package md.appoo.parser;

/**
 * @author luchfilip
 */
public class File {

    /*
    * Method which parses a file/string
    * */
    public static String parseFile(String file) {
        // split lines into a String[]
        String[] lines = file.split("\\r?\\n");

        // initialize output string
        String output = "";

        // parse every line
        for (String line : lines) {
            output += Line.parseLine(line);
        }

        // return result
        return output;
    }
}
