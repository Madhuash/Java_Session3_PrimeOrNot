import java.util.Scanner;
class PrimeOrNot
{
	
	public boolean IsPrime(int num)
	
	{
		int temp;
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   } 
		}
		return isPrime;
	}
	
   public static void main(String args[])
   {		
	   boolean isPrime=true;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	
	int num=scan.nextInt();
	PrimeOrNot pon = new PrimeOrNot();
	isPrime = pon.IsPrime(num);
	
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   }
}

