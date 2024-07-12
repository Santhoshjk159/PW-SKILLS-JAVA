import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        // Initialize stacks for numbers and strings
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;  // Initialize the repeat number

        // Iterate through each character in the input string
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the number k
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current number and string onto their stacks
                numStack.push(k);
                strStack.push(currentString.toString());
                // Reset currentString and k for the new block
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop the number and string from their stacks
                int repeatTimes = numStack.pop();
                StringBuilder lastString = new StringBuilder(strStack.pop());
                // Repeat the current string repeatTimes times
                for (int i = 0; i < repeatTimes; i++) {
                    lastString.append(currentString);
                }
                // Update the currentString with the result
                currentString = lastString;
            } else {
                // Append the character to the current string
                currentString.append(ch);
            }
        }

        // Return the fully decoded string
        return currentString.toString();
    }

    public static void main(String[] args) {
        String encodedString = "3[a2[bc]]";
        System.out.println(decodeString(encodedString));  // Output: "abcbcabcbcabcbc"
    }
}
