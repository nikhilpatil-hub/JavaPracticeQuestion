package conditionAndLoops;
import java.util.Scanner;
public class SumOfEvenNumTillEnd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int totalSum = 0;
		for(int i = 1;i<=n;i++) {
			if(i%2==0) {
				totalSum = totalSum + i;
			}
		}
		System.out.println(totalSum);
	}

}
