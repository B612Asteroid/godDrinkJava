 package com.code.test;

import java.util.ArrayList;
import java.util.List;

public class InterestingDigits {
	
	
	public int[] digits(int base) {
		
		int data = base - 1;
		int[] results = new int[base];
		
		int count = 0;
		for (int i = 2; i < data; i++) {
			if (data % i == 0) {
				results[count] = i;
				count++;
			}
		}	
		return results;
	}
	
	public int[] digits2(int base) {		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 2; i < base; i++) {
			boolean ok = true;
			for (int k1 = 0; k1 < base; k1++) {
				for (int k2 = 0; k2 < base; k2++) {
					for (int k3 = 0; k3 < base; k3++) {
						if (k1 + k2 * base + k3 * base * base % i == 0 && (k1 + k2 + k3) % i != 0) {
							ok = false;
							break;
						}
					}
					if (!ok) break; 
				}
				if (!ok) break; 
			}
			if (ok) list.add(i);
		}
		
		int[] results = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			results[i] = list.get(i);
		}
		
		return results;
	}
	
}
