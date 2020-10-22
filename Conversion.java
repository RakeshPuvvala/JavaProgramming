package Introduction;
import java.util.Scanner;

public class DaysAndYears {

	public static void main(String[] args) {
		Scanner D= new Scanner(System.in);
		long minutes = D.nextLong();
		long y= (minutes/1440)/365;
		long r=(minutes/(1440))%365;
				
		System.out.println(minutes+" minutes is approximately "+y+"years and "+r+" days.");

	}

}
