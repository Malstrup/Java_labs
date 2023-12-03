public class Lab04 {
    enum Meal { BREAKFAST, LUNCH, DINNER }

    public static void main(String[] args) {
        byte byteValue = 1;
        short shortValue = 2;
        int integerValue = 3;
        char charValue = 'a';
        String stringValue = "Hello";
        Meal enumValue = Meal.LUNCH;

        switch (byteValue) {
            case 1:
                System.out.println("Byte variable is 1");
                break;
            default:
                System.out.println("Byte variable is not 1");
        }

        switch (shortValue) {
            case 2:
                System.out.println("Short variable is 2");
                break;
            default:
                System.out.println("Short variable is not 2");
        }

        switch (integerValue) {
            case 3:
                System.out.println("Integer variable is 3");
                break;
            default:
                System.out.println("Integer variable is not 3");
        }

        switch (charValue) {
            case 'a':
                System.out.println("Char variable is 'a'");
                break;
            default:
                System.out.println("Char variable is not 'a'");
        }

        switch (stringValue) {
            case "Hello":
                System.out.println("String variable is \"Hello\"");
                break;
            default:
                System.out.println("String variable is not \"Hello\"");
        }

        switch (enumValue) {
            case LUNCH:
                System.out.println("Enum variable is LUNCH");
                break;
            default:
                System.out.println("Enum variable is not LUNCH");
        }
    }
}