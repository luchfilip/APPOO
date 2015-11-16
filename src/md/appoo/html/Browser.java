package md.appoo.html;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * @author luchfilip
 */
public class Browser {

    public static void showInBrowser(String url) {
        try {
            File htmlFile = new File(url);
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
