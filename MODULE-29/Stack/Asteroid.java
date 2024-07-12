import java.util.Stack;

public class Asteroid {
    // Method to determine the surviving asteroid
    public int Min(int a, int b) {
        if (Math.abs(a) == Math.abs(b)) {
            return 0; // Both asteroids destroy each other
        }
        return Math.abs(a) > Math.abs(b) ? a : b; // The larger asteroid survives
    }

    // Method to handle the asteroid collision logic
    public Stack<Integer> Result(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int e : arr) {
            boolean destroyed = false;
            while (!stk.isEmpty() && e < 0 && stk.peek() > 0) {
                int top = stk.pop();
                int survivor = Min(top, e);
                if (survivor == 0) {
                    destroyed = true; // Both asteroids destroy each other
                    break;
                } else if (survivor == top) {
                    stk.push(top); // Push back the surviving asteroid
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stk.push(e); // Push the current asteroid if it was not destroyed
            }
        }
        return stk;
    }

    public static void main(String[] args) {
        Asteroid asteroid = new Asteroid();
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {10, 2, -5};

        System.out.println(asteroid.Result(asteroids1)); // Output should be [5, 10]
        System.out.println(asteroid.Result(asteroids2)); // Output should be [10]
    }
}
