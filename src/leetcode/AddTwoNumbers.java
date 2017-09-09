package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @Author doctorrm
 * @Time 2017-09-10 ÉÏÎç12:04:56
 */
public class AddTwoNumbers {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(3);
		linkedList.add(7);
		linkedList.add(1);
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(4);
		linkedList2.add(6);
		System.out.println(addTwoNumbers(linkedList, linkedList2));

	}

	public static Integer addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(list1);
		String array1Str = "";
		int array1Int = 0;
		ArrayList<Integer> array2 = new ArrayList<Integer>(list2);
		String array2Str = "";
		int array2Int = 0;
		for (int i = array1.size() - 1; i > -1; i--) {
			array1Str = array1Str + array1.get(i);
			array1Int = Integer.parseInt(array1Str);
		}

		for (int j = array2.size() - 1; j > -1; j--) {
			array2Str = array2Str + array2.get(j);
			array2Int = Integer.parseInt(array2Str);
		}
		return (array1Int + array2Int);
	}

}