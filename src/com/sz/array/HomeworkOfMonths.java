package com.sz.array;

import java.util.Scanner;

public class HomeworkOfMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input a number: ");
		String input = sc.nextLine();
		String month = " ";
		int i = Integer.parseInt(input);

		switch (i) {
		case 1 : month = "January"; break;
		case 2 : month = "February"; break;
		case 3 : month = "March"; break;
		case 4 : month = "April"; break;
		case 5 : month = "May"; break;
		case 6 : month = "June"; break;
		case 7 : month = "July"; break;
		case 8 : month = "August"; break;
		case 9 : month = "September"; break;
		case 10 : month = "October"; break;
		case 11 : month = "November"; break;
		case 12 : month = "December"; break;


		}
		System.out.println(month);



	}

}
