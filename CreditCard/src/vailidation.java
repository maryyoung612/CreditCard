import java.util.Scanner;
public class vailidation
	{
		public static void main(String[] args)
			{
			Scanner userInput=new Scanner(System.in);
			System.out.println("Please enter a 16 digit number and I will check to see if it is a vaild number.");
			long cardNum = userInput.nextLong();
			long nums[] = new long[16];
			long a;
			for(int i=0; i<16;i++)
				{
					a=cardNum%10;
					nums[i]=a;
					cardNum= cardNum/10;
				}
			long evenN[]= new long[16];
			long oddN[]= new long[16];
			for(int i=0;i<16;i++)
				{
				if(i%2==0)
					{
					oddN[i]=nums[i];
					System.out.println("odd nums: " + oddN[i]);
					}
				else
					{
					evenN[i]=nums[i]*2;
					System.out.println("every other mult: " + evenN[i]);
					if(evenN[i]>=10)
						{
						long strip = ((evenN[i]/10)+(evenN[i]%10));
						System.out.println("strip and add: " + strip);
						evenN[i]=strip;
						}
					else
						{
						}
					}
				}
			long sum=0;
			long sum2=0;
			long sum3=0;
			for(int i=0;i<16;i++)
				{
				sum =sum+evenN[i];
				sum2=sum2+oddN[i];

				}
			sum3=sum+sum2;
			System.out.println("Sum: "+sum3);
			if(sum3%10==0)
				{
				System.out.println("The credit card number is potentially vaild.");
				}
			else
				{
				System.out.println("The credit card is not vaild.");	
				}
			}
	}