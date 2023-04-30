package com.warmup.assignments.array1;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		int[] nums = { -1, 2, 1, 4 };
		int target = 1;
		threeSumClosest(nums, target);

	}

	public static int threeSumClosest(int[] nums, int target) {
		int closest = Integer.MAX_VALUE;
		int n = nums.length;
		int value = 0;
		Arrays.sort(nums);
		for (int i = 0; i < n; i++) {
			int ptr1 = i + 1;
			int ptr2 = n - 1;
			while (ptr1 < ptr2) {

				int sum = nums[i] + nums[ptr1] + nums[ptr2];

				System.out.println(sum);
				int diff = Math.abs(target - sum);
				System.out.println("diff ----> " + diff);
				if (diff < closest) {
					value = sum;
					closest = diff;
				}
				closest = Math.min(diff, closest);
				System.out.println("closest ----> " + closest);

				if (sum > target) {
					ptr2--;
				} else {
					ptr1++;
				}

			}
		}
		return value;

	}
}
