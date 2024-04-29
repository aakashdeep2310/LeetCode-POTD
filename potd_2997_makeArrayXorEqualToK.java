
public class potd_2997_makeArrayXorEqualToK {

    public int minOperations(int[] nums, int k) {
        //find the xor of the array
        int finalXor = 0;
        for(int i = 0; i<nums.length; i++){
            finalXor = finalXor^nums[i];
        }
        int count = 0;
        //find the different bits in the finalXor & K
        while(k > 0 || finalXor > 0){
            if(k%2 != finalXor%2){
                count++;
            }
            k/=2;
            finalXor/=2;
        }
        return count;
        
    }
    // another ways
    public int minOperations2(int[] nums, int k) {
        //find the xor of the array
        int finalXor = 0;
        for(int i = 0; i<nums.length; i++){
            finalXor = finalXor^nums[i];
        }
        int res = finalXor^k;
        int count = 0;
        //find the different bits in the finalXor & K
        while(res > 0){
            if(res%2 == 1){
                count++;
            }
            res /=2;
        }
        return count;
        
    }
    public int minOperations3(int[] nums, int k) {
        //find the xor of the array
        int finalXor = 0;
        for(int i = 0; i<nums.length; i++){
            finalXor = finalXor^nums[i];
        }
        int res = finalXor^k;
        int count = 0;
        //find the different bits in the finalXor & K
        // res & (res-1) // rightmost set bit(1) -> 0
        while(res > 0){
            count++;
            res = res & (res-1);
        }
        return count;
        
    }
    
}