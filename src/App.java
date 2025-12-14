import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * You are given an integer array 'height' of length 'n'. There are n vertical
         * lines drawn such that the two endpoints of the ith line are (i , 0) and (i ,
         * height[i]).
         * 
         * Find two lines that together with the x-axis form a container, such that the
         * container conatins the most water.
         * 
         * Return the maximum amount of water a container can store.
         * 
         * Notice that you may not slant the container.
         */
        System.out.println("Hello, World!");
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Solution solution = new Solution();
        int maxAmountOfWaterAContainerCanStore = solution.maxArea(height);
        System.out.println("The given heights are:" + Arrays.toString(height)
                + " and the maximum amount of Water a container can store is:" + maxAmountOfWaterAContainerCanStore);
    }
}
