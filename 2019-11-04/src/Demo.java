import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    /*
    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
    并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
    */
    public int[] twoSum0(int[] nums, int target) {  //执行超出时长限制
        Arrays.sort(nums);
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] < target){
                left++;
            }else{
                result[0] = nums[left];
                result[1] = nums[right];
            }
        }
        return result;
    }
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i < nums.length - 1;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i < nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) && map.get(diff) != i){
                return new int[] {i,map.get(diff)};
            }
        }
        return new int[]{};
    }
}
