import java.util.Arrays; //导入该“包”才可使用
//java.util.System;  //无需导入（import）该包即可使用

//**数组的练习**
public class Course0719 {
	//交换元素
	public static void swap(int[] a,int i,int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
 	}
	
	public static void bubbleSort1(int[] a) {
	//冒泡排序1(从前往后冒泡，每次将最大的放到乱序部分的最后面)
		for(int i = 0;i < a.length;i++){
			boolean sorted = true;
			for(int j = 0;j < a.length - i - 1;j++){
				if(a[j] > a[j + 1]){
					swap(a,j,j + 1);
					sorted = false; 
				}
			}
			if(sorted == true){
				return ; //如果某次冒泡一次交换都没发生，说明已全部有序，直接退出
			}
		}
	}
	
	public static void bubbleSort2(int[] a){
	//冒泡排序2(从后往前冒泡，每次将最小的放到乱序部分的最前面)	
		for(int x = 0;x < a.length;x++){
			boolean sorted = true;
			for(int y = a.length - 1;y > x;y--){
				if(a[y] < a[y - 1]){
					swap(a,y - 1,y);
					sorted = false;
				}
			}
			if(sorted == true){
				return ; //如果某次冒泡一次交换都没发生，说明已全部有序，直接退出
			}
		}
	}
	
	public static double average1(int[] a){
	//去掉最大值和最小值的数据的平均值
		double[] result = new double[3];
		result[0] = a[0]; //max
		result[1] = a[0]; //min
		result[2] = a[0]; //sum
		for(int i = 1;i < a.length;i++){
			result[2] += a[i];
			if(result[0] < a[i]){
				result[0] = a[i];
			}
			if(result[1] > a[i]){
				result[1] = a[i];
			}
		}
		return (double)(result[2] - result[0] - result[1])/(a.length - 2);
	}
	
	public static double average2(int[] a){
	//去掉最大值和最小值的数据的平均值
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int v : a){
			sum += v;
			if(v > max){
				max = v;
			}
			if(v < min){
				min = v;
			}
		}
		return (double)(sum - max - min)/(a.length - 2);
	}
	
	public static int[] rotate(int[] nums,int k){
	//将数组旋转k次如：{1,2,3,4,5} -->  {3,4,5,1,2}
		k = k % nums.length;
		int[] rightPart = Arrays.copyOfRange(nums,nums.length - k,nums.length);
		//System.out.println(Arrays.toString(rightPart));
		System.arraycopy(nums,0,nums,k,nums.length - k);
		//System.out.println(Arrays.toString(nums));
		System.arraycopy(rightPart,0,nums,0,k);
		return nums;
	}
	
	public static int[] partition1(int[] nums){
	//调整顺序使得偶数在前，奇数在后（定义两个索引变量begin和end，从两边向中间靠拢）
		int begin = 0;
		int end = nums.length - 1;
		while(begin < end){
			//begin == end 意味着只剩下最中间的元素，无需再考虑奇偶
			while(begin < end && nums[begin] % 2 == 0){
				begin++;
			}
			while(begin < end && nums[end] % 2 == 1){
				end--;
			}
			swap(nums,begin,end);
		}
		return nums;
	}
	
	public static int[] partition2(int[] nums){
	//调整顺序使得偶数在前，奇数在后(定义两个索引变量，同时从左边界开始，用end遍历)
		int begin = 0;
		int end = 0;
		//for循环亦可
		while(end < nums.length){
			while(nums[end] % 2 == 0){
				swap(nums,begin,end);
				begin++;
			}
			end++;
		}
		return nums;
	}
	
	//主方法
	public static void main(String[] args) {
		int[] a = new int[]{9,8,7,6,5,4,3,2,1};
		
		//冒泡排序
		bubbleSort1(a);
		//bubbleSort2(a);
		System.out.println(Arrays.toString(a));
		
		//平均值
		double avg = average1(a);
		//double avg = average2(a);
		System.out.println("avg = " +avg);
		
		//旋转
		System.out.println(Arrays.toString(rotate(a,3)));
		
		//元素中偶数在前，奇数在后
		System.out.println(Arrays.toString(partition1(a)));
		//System.out.println(Arrays.toString(partition2(a)));
	}
}







