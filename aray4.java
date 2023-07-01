import java.util.HashMap;
import java.util.Map;

public class aray4 {
    public static int max(int nums[]) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if (countMap.containsKey(count)) {
                int prevIndex = countMap.get(count);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                countMap.put(count, i);
            }
        }
        return maxLength;
    }
     public static void main(String args[]){
        int nums[]={0,1};
        int ans=max(nums);
        System.out.println(ans);
    }
}

   