package practice;

public class SunsetView {
	 
    public static int countBuildingsWithSunsetView(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
 
        int count = 1;  // The last building will always have a sunset view
        int maxHeight = heights[heights.length - 1];
 
        for (int i = heights.length - 2; i >= 0; i--) {
            if (heights[i] > maxHeight) {
                count++;
                maxHeight = heights[i];
            }
        }
 
        return count;
    }
 
    public static void main(String[] args) {
        int[] buildings = {3, 7, 8, 3, 6, 1};
        int result = countBuildingsWithSunsetView(buildings);
        System.out.println("Number of buildings with sunset view: " + result);
    }
}