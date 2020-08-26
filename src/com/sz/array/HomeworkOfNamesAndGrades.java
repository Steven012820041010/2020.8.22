package com.sz.array;

import java.util.Scanner;

public class HomeworkOfNamesAndGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String[] name = new String[5];
		int[] grades = new int[5];
		double sum = 0;
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		String hN = " ";
		String lN = " ";
		for (int i=0; i<name.length; i++) {
			String iN = sc.next();
			name[i] = iN;
			String s = sc.next();
			try {
				int iG = Integer.parseInt(s);
				grades[i]= iG;
				sum += iG;
				

			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		for (int i=0; i<grades.length; i++) {
			int curH = grades[i];
			String curN = name[i];
			if (curH>highest) {
				highest = curH;
				hN = curN;
			}
		}
		for (int i=0; i<grades.length; i++) {
			int curH = grades[i];
			String curN = name[i];
			if (curH<lowest) {
				lowest = curH;
				lN = curN;
			}
		}
		for (int i=0; i<grades.length; i++) {
			int idx = i;
			for (int j=i+1; j<grades.length; j++) {
				if (grades[i] > grades[j]) {
					grades[i] = grades[j];
					name[i] = name[j];
					idx = j;
				}
			}
			if (i != idx) {
				grades[idx]=grades[i];
				name[idx]=name[i];
				
			}
		}
		double average = sum / grades.length;
		System.out.format("The average of the twenty student is %.2f\n",average);
		System.out.format("%s gets the highest grades which is %d\n", hN, highest);
		System.out.format("%s gets the lowest grades which is %d\n", lN, lowest);
	
		for (int i=0; i<grades.length; i++) {
			System.out.format("%s - %d\n", name[i], grades[i]);
		}
	
	}

}
