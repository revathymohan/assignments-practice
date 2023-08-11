package com.assignments.array.part2;

import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };
		int[] elements = nextGreaterElement(nums1, nums2);
		for (int i : elements) {
			System.out.println(i);
		}

	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int l = nums2.length;
		int index = 0;
		for (int i = 0; i < nums1.length; i++) {
			int j = 0;
			while (j < l && nums2[j] != nums1[i]) {
				j++;
			}
			index = j + 1;

			while (index < l && nums2[index] < nums1[i]) {
				index++;
			}
			if (j == l - 1 || index > l - 1) {
				nums1[i] = -1;
			} else {
				nums1[i] = nums2[index];
			}

		}
		return nums1;
	}

}
