package com.warmup.assignments.array1;

import java.util.List;
import java.util.ArrayList;

public class MissingRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 1, 3, 50, 75 };
		findMissingRanges(nums, 0, 99).stream().forEach(System.out::print);

	}

	public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
		// write your code here
		int l = nums.length;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < nums.length - 1; i++) {

			int diff = nums[i + 1] - nums[i];
			if (diff > 1) {
				if (diff == 2) {
					String first = String.valueOf(nums[i] + 1);
					list.add(first + " ");

				} else {
					String s = String.format(" %d->%d ", nums[i] + 1, nums[i + 1] + 1);
					list.add(s);
				}
			}

		}
		if (upper > nums[l - 1]) {

			String s = String.format(" %d->%d ", nums[l - 1] + 1, upper);

			list.add(s);
			// list.add(first + "->" + second + " ");

		}
		return list;

	}
}
