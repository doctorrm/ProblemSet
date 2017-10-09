package algorithm;

public class BinarySearch {
	Integer start, middle, end;

	public  int findIndex(Integer[] paramArray, Integer target) {
		Integer len = paramArray.length;
		start=0;end=len-1;
		while(start<=end){
			middle=start+(end-start)/2;
			if(target==paramArray[middle]){
				return middle;
			}else if (target<paramArray[middle]) {
				end=middle-1;
			}else {//<target
				start=middle+1;
			}
		}
		return -1;//null or other invalid input or not found ,etc.
	}

	public  int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {//WHILE IS VERY IMORTANT.
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		BinarySearch binarySearch=new BinarySearch();
		
		Integer[] array = { 1, 3,6,7,8 };
		System.out.println(binarySearch.findIndex(array, 3));
		//System.out.println(binarySearch.indexOf(array, 3));
	}
}
