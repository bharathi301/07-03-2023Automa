package New;

public class Excep1
{
      public static void divide() throws ArithmeticException
      {
    	    int a = 1;
			int b = 0;
			int c = a/b;   
      }
	public static void main(String[] args) 
	{
		try
		{
			divide(); //throw new AE
		}
		catch(Exception e)
		{
			System.out.println("handled");
	}

}
}
