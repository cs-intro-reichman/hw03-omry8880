/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String changed = "";

        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) { // Checks if letter is upper case using ASCII table numbers
               changed += (char) ((int) s.charAt(i) + 32); // difference between upper case and lower case of same letter 
            } else {
                changed += s.charAt(i); // If not an upper case letter, then continue
            }
        }
        return changed; 
    }
}
