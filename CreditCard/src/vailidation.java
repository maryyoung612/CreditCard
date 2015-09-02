import java.util.Scanner;
public class vailidation
	{
		public static void main(String[] args)
			{
			Scanner userInput=new Scanner(System.in);
			System.out.println("Please enter a 16 digit number and I will check to see if it is a vaild number.");
			long cardNum = userInput.nextLong();
			long nums[] = new long[16];
			long a = 1;
			for(int i=0; i<cardNum;i++)
				{
					a=cardNum%10;
					nums[i]=a;
					System.out.println(a);
					cardNum= cardNum/10;
				}
			long even[] = new long[8];
			long b=1;
			for(int i=0;i<16;i++)
				{
				if(i%2==0)
					{
					even[i]=b;
					long mult = even[i]*2;
					if(even[i]>=2)
						{
						
						}
					else
						{
							
						}
					}
				else
					{
						
					}
				}
			}
	}