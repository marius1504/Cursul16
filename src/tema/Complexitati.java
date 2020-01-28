package tema;

public class Complexitati {
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int middle = -1;
		while(left <= right) {
			middle = (left + right) / 2;
			
			if(target == nums[middle]) {
				return middle;
			}else if(target > nums[middle]) {
				left = middle + 1;
			}else if(target < nums[middle]) {
				right = middle - 1;
			}
		}
		
		System.out.print("\t Elementul trebuie inserat pe pozitia: ");
		if(right < 0) {
			return 0;
		}else {
			return left > right ? left : right;
		}
	}
	
	public static void main(String[] args) {
		int[] values = {3, 9, 12, 34, 54, 111, 234};
		int key = 15;
		System.out.println(binarySearch(values, key));
	}
}
