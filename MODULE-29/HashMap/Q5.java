import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransom note");
        String ran = sc.nextLine();
        System.out.println("Enter the magazine");
        String mag = sc.nextLine();

        char[] rans = ran.toCharArray();
        char[] magz = mag.toCharArray();

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < rans.length; i++) {
            if (hm1.containsKey(rans[i])) {
                hm1.put(rans[i], hm1.get(rans[i]) + 1);
            } else {
                hm1.put(rans[i], 1);
            }
        }

        for (int i = 0; i < magz.length; i++) {
            if (hm2.containsKey(magz[i])) {
                hm2.put(magz[i], hm2.get(magz[i]) + 1);
            } else {
                hm2.put(magz[i], 1);
            }
        }

        boolean canConstruct = true;
        for (Map.Entry<Character, Integer> e : hm1.entrySet()) {
            if (hm2.getOrDefault(e.getKey(), 0) < e.getValue()) {
                canConstruct = false;
                break;
            }
        }

        if (canConstruct) {
            System.out.println("The ransom note can be constructed from the magazine.");
        } else {
            System.out.println("The ransom note cannot be constructed from the magazine.");
        }

        sc.close();
    }
}
