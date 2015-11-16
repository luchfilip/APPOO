package md.appoo.utils;


/*
* Class for utility methods
* */
public class Utils {

    /*
    * Counts number of same characters in a give string
    * @param    s   string where characters will be counted
    * @param    c   char which has to be counted in a given string
    * */
    public static int countSameChar(String s, char c) {
        return s.length()==0 ? 0 : (s.charAt(0)==c ? 1 : 0) + countSameChar(s.substring(1),c);
    }

}
