import java.util.Scanner;
import java.io.*;

public class Calender{
	public static int dayNumber(int day, int month, int year) {
		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		if (month < 3)
			year -= 1;
		return ( year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
	}

	public static boolean isLeapYear(int year) {
		return (((year % 4 == 0) && (year % 100) != 0) || (year % 400 == 0));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String  months[] = {"January", "February", "March   ", "April   ", "May    ", "June   ", "July   ", "August", "September", "October", "November", "December"};

		System.out.println("\t------------------------ CALENDAR ------------------------");
		System.out.print("\tEnter year: ");
		int year = sc.nextInt();

		System.out.println("\n");

		for (int i = 0; i < 12; i++) {
			System.out.println("\n\t---------------------------------------------------");
			System.out.println("\t\t\t\t" + months[i]);
			System.out.println("\t---------------------------------------------------");

			System.out.println("\tMon\tTue\tWed\tThu\tFri\tSat\tSun\t");

			System.out.print("\t");
			int dayn = dayNumber(1, i + 1, year) - 1;
			if (dayn == -1) {
				dayn = 6;
			}
			for (int space = 1; space <= dayn; space++) {
				System.out.print("\t");
			}

			int totalDays = days[i];
			if (i == 1) {
				if (isLeapYear(year)) {
					totalDays = 29;
				}
			}

			for (int j = 1; j <= totalDays; j++) {
				if (j < 10) {
					System.out.print(' ');
				}
				System.out.print(" " + j + "\t");
				dayn += 1 ;
				if (dayn == 7) {
					dayn = 0;
					System.out.print("\n\t");
				}
			}
		}
        sc.close();
	}
}