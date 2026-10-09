package conditionAndLoops;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		
		int ans = 1;
		while(n>0) {
			ans = ans * x;
			n = n -1;
		}
		System.out.println(ans);
	}

}
