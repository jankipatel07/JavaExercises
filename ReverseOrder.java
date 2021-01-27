
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

//import org.apache.commons.lang.StringUtils;

public class ReverseOrder {

	// Write a method that takes in two Linked Lists representing non-negative
	// Integers.  
	// The digits are stored in reverse order and each of their nodes contain a s
	// ngle digit.
	// Add the two numbers and return it as a linked list.
	//  
	// You may assume the two numbers do not contain any leading zero, except the
	// number 0 itself.
	//  
	// eg.
	// Input: (5 -> 2 -> 3)  + (1 + 8 + 4)
	// Output: (6 -> 0 -> 8 )
	// i.e 325 + 481 = 806
	// Input: List1: 5->6->3 // represents number 365
	// List2: 8->4->2 // represents number 248
	// Output: Resultant list: 3->1->6 // represents number 613
	//
	//
	// Input: List1: 7->5->9->4->6 // represents number 64957
	// List2: 8->4 // represents number 48
	// Output: Resultant list: 5->0->0->5->6 // represents number 65005
	// Given two numbers represented by two lists, write a function that returns the
	// sum list. The sum list is list representation of the addition of two input
	// numbers.

	public static void main(String[] args) {
		// List l2 = new ArrayList();
		int arr[][] = new int[10][10];
		arr[1][1] = 8778;
		arr[1][2] = 132;
		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(5, 2, 3));
		ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1, 8, 4));
		sumList(l1, l2);

		ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(7, 5, 9, 4, 6));
		ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(8, 4));
		sumList(l3, l4);

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(2);
		list.add(3);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(8);
		list2.add(4);
		sumLinkedList(list, list2);

		// int ssnArray[] = new int[5];
		// ssnArray[1] = Integer.parseInt("3423");;
		// String ssn = "3423";
		// int arrIndex = -1;
		// for (int i = 0; i < ssnArray.length; i++) {
		// if (ssnArray[i] == Integer.parseInt(ssn)) {
		// arrIndex = i;
		// }
		// System.out.println("ssn " + arrIndex);
		// }
		// if(ssnArray.toString().contains(ssn)){
		// arrIndex = ssnArray.toString().indexOf(ssn);
		// }
	}

	private static void sumLinkedList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		int listSize = 0;
		if (l1.size() < l2.size()) {
			listSize = l2.size();
		} else {
			listSize = l1.size();
		}
		List<Integer> l3 = new ArrayList<Integer>();

		int first = 0;
		for (int i = 0; i < listSize; i++) {
			int val1 = 0, val2 = 0;
			if (l1.get(i) != null) {
				val1 = Integer.parseInt(l1.get(i).toString());
			}
			if (l2.size() > i) {
				val2 = Integer.parseInt(l2.get(i).toString());
			} else {
				val2 = 0;
			}
			int sum = val1 + val2 + first;
			first = 0;

			if (sum > 9) {
				double div = sum / 10;
				first = (int) Math.floor(div);
				int second = sum - (first * 10);
				l3.add(second);
			} else {
				l3.add(sum);
			}
		}
		System.out.println("List 3" + l3);
	}

	private static List<Integer> sumList(List<Integer> l1, List<Integer> l2) {
		int listSize = 0;
		if (l1.size() < l2.size()) {
			listSize = l2.size();
		} else {
			listSize = l1.size();
		}
		List<Integer> l3 = new ArrayList<Integer>();

		int first = 0;
		for (int i = 0; i < listSize; i++) {
			int val1 = 0, val2 = 0;
			if (l1.get(i) != null) {
				val1 = Integer.parseInt(l1.get(i).toString());
			}
			if (l2.size() > i) {
				val2 = Integer.parseInt(l2.get(i).toString());
			} else {
				val2 = 0;
			}
			int sum = val1 + val2 + first;
			first = 0;

			if (sum > 9) {
				double div = sum / 10;
				first = (int) Math.floor(div);
				int second = sum - (first * 10);
				l3.add(second);
			} else {
				l3.add(sum);
			}
		}
		System.out.println("List 3" + l3);
		return l3;
	}
}
