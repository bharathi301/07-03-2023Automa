package New;

public class MOverloadingExp 
{
	 static void text(int i)
	{
		System.out.println("printing only integer " + i);
	}
	static void text(int i,String str )
	{
		System.out.println("printing only integer and string " + i + " "+str);
	}
	static void text(String str,int i)
	{
		System.out.println("printing only string and integer "+str+ " " + i);
	}
	static void text(String str,int i, int b)
	{
		System.out.println("printing only string and multiple integers "+str+ " " + i +" "+b);
	}
	public static void main(String[] args)
	{
		text(10);
		text(15,"rakesh");
		text("rakesh",20);
		text("deepa",13,45);
	}

}
