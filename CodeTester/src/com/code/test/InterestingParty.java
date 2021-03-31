package com.code.test;

/**
 * Top Coder 2�� ����
 * @author �۱��
 *
 */
public class InterestingParty {

	public int bestInvitation(String[] first, String[] second) {
		
		int friendCount = 0;
		for (int i = 0; i < first.length - 1; i++) {
			int counter = 0;
			for (int j = i + 1; j < first.length;) {
				// #. ģ���� ���ɻ簡 ��ġ��
				if (first[i].equals(second[j]) || first[i].equals(first[j]) || second[i].equals(second[j]) || first[j].equals(second[i])) {
					// #. ī���� ������ �ø�.
					counter++;
				}
			}
			friendCount = Math.max(friendCount, counter);
		}
		
		return friendCount;
	}
}
