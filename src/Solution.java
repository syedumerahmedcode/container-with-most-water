public class Solution {

    public int maxArea(int[] height) {
        /**
         * initializing variables
         */
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        /**
         * loop through and conevr left and right from both sides until they cross.
         */
        while (left < right) {
            /**
             * Think here of a rectangle and go for with * less height
             */
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;
            max = Math.max(max, area);
            /**
             * If current height of left<=right height, update left counter otherwise update
             * right counter
             */
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

}
