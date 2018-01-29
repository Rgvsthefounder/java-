package class2;

public class class_2_primeNo_Raghav {
	// to check the no. is prime or not 
public static void main(String[]args) {
	
	int num =10;
	int i=2;
	int num2=0;
	while(i<=num/i){
		num2 = num%i;
		i++;
	
	if(num2==0)
	{
		System.out.println("it is not prime");
		break;
	}
	}
	if(num2!=0){
		System.out.println("it is prime");
	}
	

}
}