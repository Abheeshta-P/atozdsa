import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
	int n,temp,even=0,odd=0;
Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n!=0){
		temp=n%10;
		if(temp%2==0)
		even+=temp;
		else
		odd+=temp;
		n=n/10;

	}
	System.out.println(even+" "+odd);
}

	}

