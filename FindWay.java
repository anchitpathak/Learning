package com.practice.demo;

import java.util.ArrayList;
import java.util.List;

public class FindWay {
	
	static List<Integer> list = new ArrayList<Integer>();
	
	static void solve(int steps[],int dest, int remainingSteps, int start) {
		int len=steps.length;
		if( start==dest) {
			System.out.println(list);
			return;
		}
		// hello bug fixed
		for(int i=0;i<len;i++) {
			if(steps[i]<=remainingSteps) {
				int nextStep = start+steps[i];
				list.add(nextStep);
				solve(steps,dest,remainingSteps-steps[i], nextStep);
				list.remove(list.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		
		int steps[] = {1,2,3};
		int totalSteps=6;
		solve(steps,totalSteps,totalSteps,0);

	}

}
