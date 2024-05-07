package amber;
import java.util.*;
public class vote {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age:");
		a=sc.nextInt();
		 String s=(a>=18)?" eligible":"not eligible";
		 System.out.println(s);
		 
	}
}
