public class Problem3 {
    public static int binarySearch(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (target < nums[mid]) {
            return binarySearch(nums, target, low, mid - 1);
        }

        return binarySearch(nums, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(nums, 5, 0, nums.length - 1));
    }
}
