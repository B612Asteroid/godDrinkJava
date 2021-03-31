package com.code.test;

/**
 * Top Coder 1�� ����
 * @author �۱��
 *
 */
public class KiwiJuiceEasy {

	/**
	 * 
	 * @param capacities �� �뷮
	 * @param bottles Ű�� �ֽ��� ��
	 * @param fromId from ��
	 * @param toId  to ��
	 * @return
	 */
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		
		for (int i = 0; i < fromId.length; i++) {
			
			int from = fromId[i];
			int to = toId[i];
			
			int toCapacity = capacities[to];
			
			if (bottles[from] == 0) {
				continue;
			}
			
			int plusBottles = bottles[from] + bottles[to];
			
			if (plusBottles >= toCapacity) {
				// #. from ��Ʋ�� ���� ��ģ �ֽ��� - ���� �뷮 
				bottles[from] = plusBottles - toCapacity;
				// #. to ��Ʋ�� �ְ� �뷮���� �� ��
				bottles[to] = toCapacity;
			} else {
				// #. ���� �����ȴ��� wwww
				bottles[from] = 0;
				// #. ��ȿ �ܷ��ܷ� ��� ���ݾ�? �̰� ���� Bitch�ΰ� www
				bottles[to] = plusBottles;
			}
		}
		return bottles;
	}
	
	/**
	 * 
	 * @param capacities �� �뷮
	 * @param bottles Ű�� �ֽ��� ��
	 * @param fromId from ��
	 * @param toId  to ��
	 * @return
	 */
	public int[] thePouring2(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		
		for (int i = 0; i < fromId.length; i++) {
			
			int from = fromId[i];
			int to = toId[i];
			
			int vol = Math.min(bottles[from], capacities[to] - bottles[to]);
			bottles[from] -= vol;
			bottles[to] += vol;
		}
		return bottles;
	}
	
	
	public static void main(String[] args) {
		KiwiJuiceEasy testClass = new KiwiJuiceEasy();
		int[] capacities = {30, 20, 10}; 
		int[] bottles = {10, 5, 5};
		int[] fromId = {0, 1, 2}; 
		int[] toId = {1, 2, 0};
		int[] results = testClass.thePouring(capacities, bottles, fromId, toId);
		for (int result : results) {
			System.out.println(result);
		}
	}
}
