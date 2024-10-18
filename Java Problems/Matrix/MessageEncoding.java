public class MessageEncoding {

    // Function to encode the message using matrix multiplication
    public static int[] encodeMessage(String message, int[][] keyMatrix) {
        // Convert message to numerical values
        int[] messageVector = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            // Map characters A-Z to 1-26, space to 27
            messageVector[i] = (ch == ' ') ? 27 : (ch - 'A' + 1);
        }

        // Calculate the encoded message using the key matrix
        int[] encodedVector = new int[keyMatrix.length];
        for (int i = 0; i < keyMatrix.length; i++) {
            for (int j = 0; j < keyMatrix[0].length; j++) {
                encodedVector[i] += keyMatrix[i][j] * messageVector[j];
            }
        }

        return encodedVector; // Return the encoded vector
    }

    // Function to convert numerical values back to characters
    public static String decodeMessage(int[] encodedVector) {
        StringBuilder decodedMessage = new StringBuilder();
        for (int num : encodedVector) {
            if (num == 27) {
                decodedMessage.append(" ");
            } else {
                decodedMessage.append((char) ('A' + num - 1));
            }
        }
        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        String message = "HELLO";
        int[][] keyMatrix = {
            {2, 1}, // Key matrix for encoding
            {1, 3}
        };

        // Ensure the message length is a multiple of the key matrix size
        while (message.length() % keyMatrix[0].length != 0) {
            message += " "; // Padding with spaces
        }

        // Encode the message
        int[] encodedVector = encodeMessage(message, keyMatrix);
        
        // Print encoded message
        System.out.print("Encoded Message: ");
        for (int num : encodedVector) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Decode the message back
        String decodedMessage = decodeMessage(encodedVector);
        System.out.println("Decoded Message: " + decodedMessage);
    }
}
