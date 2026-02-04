public class MinSizeSubArraySum {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(r<nums.length){
            sum=sum+nums[r];

            while(sum>=target){
                int length = r - l + 1;
                min = Math.min(min, length);
                sum=sum-nums[l];
                l++;
            }


            r++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }



    }
}
