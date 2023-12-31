import java.util.Arrays;

public class aray5 {
    public static int minProSum(int nums1[], int nums2[]) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int minProSum = 0;

        for (int i = 0; i < n; i++) {
            minProSum += nums1[i] * nums2[n - i - 1];
        }

        return minProSum;
    }
     public static void main(String args[]){
        int nums1[]={5,3,4,2};
        int nums2[]={4,2,2,5};
        int ans=minProSum(nums1,nums2);
        System.out.println(ans);
    }
}





