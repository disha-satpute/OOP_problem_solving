public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        return decimal;
    }

    public static void main(String[] args) {
        String binary = "101";  // Example input
        System.out.println("Decimal of binary " + binary + " is: " + binaryToDecimal(binary));
    }
}
