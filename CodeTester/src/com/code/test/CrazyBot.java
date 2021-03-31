package com.code.test;

public class CrazyBot {

	boolean[][] grid = new boolean[100][100];
	int vx[] = {1, -1, 0, 0};
	int vy[] = {0, 0, 1, -1};
	
	double[] prob = new double[4];
	
	public double getProbability(int n, int east, int west, int south, int north) {
		prob[0] = east / 100.0;
		prob[1] = west / 100.0;
		prob[2] = south / 100.0;
		prob[3] = north / 100.0;
		
		return dfs(50, 50, n);
		
	}
	
	
	double dfs(int x, int y, int n) {
		// #. 갔던 곳이면 실패
		if (grid[x][y]) return 0;
		// #. 모든 지점을 돌았다
		if (n == 0) return 1;
		
		// #. 갔기 때문에 true
		grid[x][y] = true;
		double ret = 0;
		for (int i = 0; i < 4; i++) {
			// #. 이동했다.
			ret += dfs(x + vx[i], y + vy[i], n - 1) * prob[i];
		}
		// #. 돌고 싶은 만큼 돌았는데 도달하지 못했다.
		grid[x][y] = false;
		// #. 확률 리턴
		return ret;
	}
}
