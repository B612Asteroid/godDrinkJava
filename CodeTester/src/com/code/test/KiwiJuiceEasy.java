package com.code.test;

/**
 * Top Coder 1번 문제
 * @author 송기범
 *
 */
public class KiwiJuiceEasy {

	/**
	 * 
	 * @param capacities 병 용량
	 * @param bottles 키위 주스의 양
	 * @param fromId from 병
	 * @param toId  to 병
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
				// #. from 보틀은 둘이 합친 주스양 - 병의 용량 
				bottles[from] = plusBottles - toCapacity;
				// #. to 보틀은 최고 용량까지 꽉 참
				bottles[to] = toCapacity;
			} else {
				// #. 병이 비어버렸다제 wwww
				bottles[from] = 0;
				// #. 우효 꿀렁꿀렁 모두 들어갔잖아? 이거 완전 Bitch인걸 www
				bottles[to] = plusBottles;
			}
		}
		return bottles;
	}
	
	/**
	 * 
	 * @param capacities 병 용량
	 * @param bottles 키위 주스의 양
	 * @param fromId from 병
	 * @param toId  to 병
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
