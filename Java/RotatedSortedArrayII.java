public class RotatedSortedArrayII {
    public boolean search(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return true;
            }

            if (numbers[left] == numbers[mid] && numbers[mid] == numbers[right]) {
                left++;
                right--;
            } else if (numbers[left] <= numbers[mid]) {
                if (numbers[left] <= target && target < numbers[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (numbers[mid] < target && target <= numbers[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
