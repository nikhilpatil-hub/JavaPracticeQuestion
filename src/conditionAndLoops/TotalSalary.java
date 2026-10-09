package conditionAndLoops;

import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basicSalary = s.nextInt();
		char grade = s.next().charAt(0);
		double hra = 0.2 % basicSalary;
		double da = 0.5 % basicSalary;
		double pf = 0.11 % basicSalary;
		double allow;
		
		if(grade == 'a') {
			allow = 1700;
		}else if(grade =='b') {
			allow = 1500;
		}else {
			allow = 1300;
		}
		
		System.out.println(allow);
		double totalSalary = basicSalary + hra + da + allow - pf;
		System.out.println(Math.round(totalSalary));
	}

}
