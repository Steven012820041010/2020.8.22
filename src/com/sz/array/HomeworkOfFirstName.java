package com.sz.array;

import java.util.Scanner;

public class HomeworkOfFirstName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input your first name: ");
		int [] alp = new int [26];
		for (int i=0; i<alp.length; i++) {
			alp[i] = 0;
		}	

		while (true) {
			String fN = sc.nextLine();
			if ("STOP".equals(fN)) {
				break;
			}
			fN.toLowerCase();
			char c = fN.charAt(0);
			if (c >= 'a' && c<= 'z') {
				alp[c-'a']+=1;

			}

		}
		for (int i=0; i<alp.length; i++) {
			System.out.format("%c - %d\n", 'a'+i, alp[i]);
		}

	}
}


