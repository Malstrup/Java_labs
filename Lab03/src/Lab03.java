public class Lab03 {

    public static void main(String[] args) {
        // Logical operations && || !
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);

        // Ternary operation x < y ? x : y
        int x = 12;
        int y = 43;
        int min = (x < y) ? x : y;
        System.out.println("Min: " + min);

        // Bitwise logical operations & | ^ ~
        int num1 = 5;   // 0101 in binary system
        int num2 = 3;   // 0011 in binary system
        System.out.println("num1 & num2 = " + (num1 & num2));  // 0001 (1)
        System.out.println("num1 | num2 = " + (num1 | num2));  // 0111 (7)
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));  // 0110 (6)
        System.out.println("~num1 = " + (~num1));              // 1111...1111111111111111111111010 (Representation depends on size of int)

        // Shift operations >> << >>>
        int num3 = 4;   // 100 in binary system
        System.out.println("num3 >> 1 = " + (num3 >> 1));     // 010 (2)
        System.out.println("num3 << 1 = " + (num3 << 1));     // 1000 (8)
        System.out.println("num3 >>> 1 = " + (num3 >>> 1));   // 010 (2) - shift with filled zeroes
    }
}