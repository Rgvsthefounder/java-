package class2;

public class class2_pallindrome_Raghav {

	public static void main(String[]args) {
	 int n=1311;
	 int u;
	 int rev = 0;
	 int temp=n;
	 while(n>0) {
		 u=n%10;
		 rev =10*rev+u;
		 n=n/10;
	 }
		System.out.println("reverse of no is: "+rev);
		if(rev==temp)
		System.out.println("the no is pallindrome");
		else
			System.out.println("the no. is not pallindrome");
	}
}
