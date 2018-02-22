package Algorithm.leetcode;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * [IMGAE]
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 */
public class _42 {
    /**
     * 采用的是左右向中间靠拢的方法
     * @param A
     * @return
     */
    public int trap(int[] A) {
        if (A.length < 3) return 0;
        int ans = 0;

        int l = 0, r = A.length - 1;
        // find the left and right edge which can hold water,去掉开头的上升和结尾的下降
        while (l < r && A[l] <= A[l + 1]) l++;
        while (l < r && A[r] <= A[r - 1]) r--;

        while (l < r) {
            int left = A[l];
            int right = A[r];

            if (left <= right) {//left,right一直在变，二者根据木桶效应取值
                // add volum until an edge larger than the left edge,填空空白直到遇到大于left的边界
                while (l < r && left >= A[++l]) {//即使left>=A[++l]不成立，++l也会自增(因为l<r总是成立)，从而使得循环继续下去
                    ans += left - A[l];
                }
            } else {
                // add volum until an edge larger than the right volum,填空空白直到遇到大于left的边界
                while (l < r && A[--r] <= right) {//同以上的while
                    ans += right - A[r];//此时的r的坐标是上个bar
                }
            }
        }
        return ans;
    }

    //?????超时，想的是遍历
    public int trap1(int[] height) {
        if (height.length < 3) return 0;
        int m = 0;

        int l = 0, r = height.length - 1;
        // find the left and right edge which can hold water,去掉开头的上升和结尾的下降
        while (l < r && height[l] <= height[l + 1]) l++;
        while (l < r && height[r] <= height[r - 1]) r--;

        int width = 0;
        int traped_water = 0;
        for (int i = l; i < r; i++) {
            /*一个水坑开始*/
            int j = 0;
            while (i + 1 < height.length && height[i] > height[i + 1]) {//下降过程，退出后
                j = j + 1;
                width = width + 1;
                continue;
            }
            while (i >= j && i + 1 < height.length && height[i] <= height[i + 1]) {//上升
                width = width + 1;
            }
            int low = (height[i - width] < height[i]) ? i - width : i;//左右bar对比，取偏低的那个bar的坐标，木桶效应
            //计算水滴数
            traped_water = traped_water + width * height[low];
            for (int z = 0; z < width; z++) {
                traped_water = traped_water - height[z];
            }
            /*一个水坑结束*/
        }
        return traped_water;
    }


}
