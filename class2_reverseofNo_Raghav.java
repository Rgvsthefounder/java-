package class2;

public class class2_reverseofNo_Raghav {

	public static void main(String[] args) {
		
		int n = 1997;
		int u;
		int rev=0;
		while(n>0) {
		u=n%10;
		rev = rev*10 + u;
		n=n/10;
		
		}
	System.out.print("reverse of a no is "+rev);

	}

}
