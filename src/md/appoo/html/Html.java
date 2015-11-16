package md.appoo.html;

import md.appoo.Main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author luchfilip
 */
public class Html {

    /*
    * writes a given string to an html file
    * */
    public static void writeToHtml(String content) {
        String header = "<html>\n<body>";
        String footer = "</body>\n</html>";

        try {
            PrintWriter writer = new PrintWriter(Main.outputUrl, "UTF-8");
            writer.println(header);
            writer.println(content);
            writer.println(footer);
            writer.flush();
            writer.close();

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
