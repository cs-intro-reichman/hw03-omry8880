/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String uniqueString = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // if char is space, add and go on
                uniqueString += s.charAt(i);
            }
            if (uniqueString.contains(String.valueOf(s.charAt(i)))) {
                // checks if a letter is already inside the string or not. If yes, do nothing
            } else {
                uniqueString += s.charAt(i); // If not, meaning that it's unique - add it
            }
        }

        return uniqueString;
    }
}
