package md.appoo;

import md.appoo.html.Browser;
import md.appoo.html.Html;
import md.appoo.network.RequestManager;

public class Main {
    /*
    * URL where request has to be made
    * */
    static final String fileInputUrl = "https://gist.githubusercontent.com/minivan/" +
            "f29e2759c44d13e39b5b/raw/7bc948fc89d467db05d879e61ac09a7f70f75362/input.md";
    /*
    * URL to output file
    * */
    public static final String outputUrl = "output.html";
    /*
    * Stores data to be parsed
    * */
    static String input;
    /*
    * Stores parsed data
    * */
    static String output;

    public static void main(String[] args) {

        // get file from URL
        input = RequestManager.getFile(fileInputUrl);

        // parse file
        output = md.appoo.parser.File.parseFile(input);

        // print result to console
        System.out.print(output);

        // write result to an html
        Html.writeToHtml(output);

        // show result in browser
        Browser.showInBrowser(outputUrl);

    }

}
