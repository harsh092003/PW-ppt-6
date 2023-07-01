import java.util.*;

public class aray6 {
    public static void main(String[] args) {
        int changed[] = {1, 3, 4, 2, 6, 8};
        int real[] = realArray(changed);

        if (real.length == 0) {
            System.out.println("Empty array");
        } else {
            System.out.println(Arrays.toString(real));
        }
    }

    public static int[] realArray(int changed[]) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0]; 
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> realList = new ArrayList<>();
        Arrays.sort(changed);

        for (int i = 0; i < n; i++) {
            int num = changed[i];
            if (freqMap.containsKey(num) && freqMap.containsKey(num * 2) && freqMap.get(num) > 0 && freqMap.get(num * 2) > 0) {
                realList.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
                freqMap.put(num * 2, freqMap.get(num * 2) - 1);
            }
        }

        if (realList.size() == n / 2) {
            int[] originalArray = new int[realList.size()];
            for (int i = 0; i < realList.size(); i++) {
                originalArray[i] = realList.get(i);
            }
            return originalArray;
        } else {
            return new int[0]; 
        }
    }
}
