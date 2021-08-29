public class SingleNumber {
    public static void main (String[] args){
        int[] nums = {1,1,2,3,2,3,4};
        int res = singleNumber(nums);
        System.out.println(res);
    }
    public static int singleNumber(int[] nums) {
        boolean flag = false;
        if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length>1){
            for(int i=0; i<nums.length; i++){
                flag = false;
                for(int j =0; j<nums.length; j++){
                    if(nums[i] == nums[j] && i!=j){
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    return nums[i];
            }
        }
        return 0;
    }
}
