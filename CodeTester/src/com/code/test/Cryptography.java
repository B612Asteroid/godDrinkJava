package com.code.test;

import java.util.Arrays;

/**
 * Top Coder 3번 문제
 * @author 송기범
 *
 */
public class Cryptography {

	public long encrypt(int[] numbers) {
		long max = 1;
		for (int i = 0; i < numbers.length; i++) {
			long sum = 1;
			for (int j = 0; j < numbers.length; j++) {
				if (i == j) {
					sum += (numbers[j] + 1);
				} else {
					sum += numbers[j];
				}
			}
			max = Math.max(max, sum);
		}
		
		return max;
		
	}
	
	public long encrypt2(int[] numbers) {
		long max = 1;
		Arrays.sort(numbers);
		numbers[0]++;
		for (int number : numbers) {
			max += number;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
