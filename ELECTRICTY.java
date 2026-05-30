import java.util.Scanner;
public class ELECTRICTY {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		/*Q1 . Electricty bill calculation : 
				--> if(units <= 250) bill is 0 
				else bill is substarct by 250 like units - 250
		*/ 
		System.out.print("Eneter ele uints : ");
		int units = sc.nextInt();
		System.out.println("Electricty bill " + eleBill(units));
		System.out.println();
	}
	
	static int eleBill(int units){
		return ((units > 250) & true) ? units - 250 : 0;
	}	
}