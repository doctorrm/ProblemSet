package algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int[] list = { 54, 26, 93, 17, 0, 31, 44, 55, 20 };
		displayList(bubbleSort(list));
	}

	public static int[] bubbleSort(int[] list) {
		for (int i = list.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}

	public static void displayList(int[] list) {
		for (int i : list) {
			System.out.println(i);
		}
	}
}
