import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> pos = new Stack<>(); 

        for (int ast : asteroids) {
            boolean exploded = false;

            while (!pos.isEmpty() && ast < 0 && pos.peek() > 0) {
                if (pos.peek() > Math.abs(ast)) { 
                    exploded = true;
                    break;
                } else if (pos.peek() == Math.abs(ast)) { 
                    pos.pop();
                    exploded = true;
                    break;
                } else { 
                    pos.pop();
                }
            }

            if (!exploded) {
                pos.push(ast);
            }
        }

        int[] result = new int[pos.size()];
        for (int i = pos.size() - 1; i >= 0; i--) {
            result[i] = pos.pop();
        }

        return result;
    }
}