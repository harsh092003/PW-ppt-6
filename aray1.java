import java.util.*;
public class aray1 {
    public static void main(String[] args) {
        String s = "IDID";
        int permutation[] = newPermutation(s);
        System.out.println(Arrays.toString(permutation));
    }

    public static int[] newPermutation(String s) {
        int n = s.length();
        int permutation[] = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                permutation[i] = low++;
            } else {
                permutation[i] = high--;
            }
        }

        permutation[n] = low; 

        return permutation;
    }
}

