public class Palindrome {

    public static void main(String[] args) {
        String str = "SACHIN TENDULKAR";
        StringBuilder rev = new StringBuilder(str).reverse();
        
        if (str.equals(rev.toString())) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
