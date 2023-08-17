package New;

public class Sum {
   static int no = 5612;
   static int sum = 0;
	public static void main(String[] args) 
	{
		while (no!=0)
		{
			int rem= no%10;
			sum = sum+rem;
			no = no/10;
			System.out.println(sum);
		}
          System.out.println(sum);
	}

}
