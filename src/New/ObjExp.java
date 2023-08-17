package New;

public class ObjExp 
{
	int a = 10;
	
      public static void main(String[] args) 
	{
    	  ObjExp d = new ObjExp();
    	  ObjExp e = d;
    	  System.out.println(d);
    	  System.out.println(e);
		System.out.println(d.a);
		System.out.println(e.a);
		
	}

}
