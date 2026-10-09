package conditionAndLoops;
import java.util.Scanner;
public class FahToCel {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int s = a.nextInt();
		int e = a.nextInt();
		int w = a.nextInt();
		int f = s;
		while(f<=e) {
			int cel = (int)((f-32)*5.0/9.0);
			System.out.println(f + " " + cel);
			f = f + w;
		}
	}

}
