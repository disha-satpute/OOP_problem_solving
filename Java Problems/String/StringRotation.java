public class StringRotation {
    public static void main(String[] args) {
        String s1 = "MITAOE";
        String s2 = "EOATIM";
        
        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }
    }

    public static boolean isRotation(String s1, String s2) {
       
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Concatenate s1 with itself
        String concatenated = s1 + s1;

       
        return concatenated.contains(s2);
    }
}
