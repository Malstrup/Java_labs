public class Lab01 {

    public static void main(String[] args) {
        // Creating string
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");

        // Work with string length
        int length = str1.length();
        System.out.println("String length str1: " + length);

        // Work with chars in string
        char firstChar = str1.charAt(0);
        char lastChar = str1.charAt(str1.length() - 1);
        System.out.println("First char str1: " + firstChar);
        System.out.println("Last char str1: " + lastChar);

        // Work with substrings
        String substring = str2.substring(0, 5);
        System.out.println("Substring str2: " + substring);

        // String concatenation
        String concatString = str1.concat(str2);
        System.out.println("Concatenation str1 and str2: " + concatString);

        // Chars replacing
        String replacedString = str1.replace('o', '0');
        System.out.println("Replacing chars str1: " + replacedString);

        // Work with char case
        String upperCase = str1.toUpperCase();
        String lowerCase = str2.toLowerCase();
        System.out.println("UpperCase str1: " + upperCase);
        System.out.println("LowerCase str2: " + lowerCase);

        // String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("String str1 equals str2: " + isEqual);

        // String comparison (case-insensitive)
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("String str1 equals str2 case-insensitive: " + isEqualIgnoreCase);

        // Checking start and end of string
        boolean startsWithHello = str1.startsWith("Hello");
        boolean endsWithWorld = str1.endsWith("World!");
        System.out.println("String str1 starts with \"Hello\": " + startsWithHello);
        System.out.println("String str1 ends with \"World!\": " + endsWithWorld);

        // Searching for the index of a substring
        int indexOfJava = str2.indexOf("Hello");
        System.out.println("Index of a substring \"Java\" in string str2: " + indexOfJava);

        // Removing initial and final spaces
        String stringWithSpaces = "   Hello!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("String with spaces: \"" + stringWithSpaces + "\"");
        System.out.println("String without spaces: \"" + trimmedString + "\"");

        // Splitting into substrings
        String sentence = "Today is the beautiful day!";
        String[] words = sentence.split(" ");
        System.out.println("Splitting words: ");
        for (String word : words) {
            System.out.println(word);
        }

        // Conversion from the number to string
        int number = 101;
        String numberString = String.valueOf(number);
        System.out.println("Number converted into string: " + numberString);
    }
}