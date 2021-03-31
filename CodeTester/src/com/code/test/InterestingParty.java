package com.code.test;

/**
 * Top Coder 2번 문제
 * @author 송기범
 *
 */
public class InterestingParty {

	public int bestInvitation(String[] first, String[] second) {
		
		int friendCount = 0;
		for (int i = 0; i < first.length - 1; i++) {
			int counter = 0;
			for (int j = i + 1; j < first.length;) {
				// #. 친구의 관심사가 겹치면
				if (first[i].equals(second[j]) || first[i].equals(first[j]) || second[i].equals(second[j]) || first[j].equals(second[i])) {
					// #. 카운터 변수를 올림.
					counter++;
				}
			}
			friendCount = Math.max(friendCount, counter);
		}
		
		return friendCount;
	}
}
