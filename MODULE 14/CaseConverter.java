public class CaseConverter {

    public static void main(String[] args) {
        String str = "SACHIN TENDULKAR";
        String convertedStr = convertCase(str);
        
        System.out.println("Original: " + str);
        System.out.println("Converted: " + convertedStr);
    }

    public static String convertCase(String str) {
        StringBuilder result = new StringBuilder(str.length());

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Keep non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }
}
