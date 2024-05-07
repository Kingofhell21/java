package amber;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		int p;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter username: ");
		String name=sc.nextLine();
		
		if (name.equals("ADMIN")||(name.equals("admin"))){
				System.out.print("enter password :");
				p=sc.nextInt();
				
				if(p==123){
					System.out.println("login success");
				}
				else {
					System.out.println("wrong password");
				}
		}
		else {
				System.out.println("wrong username");	
				}

	}
	}

