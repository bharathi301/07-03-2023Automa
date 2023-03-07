package New;
class Watsappv1
{  
void msg()
{
	System.out.println("texting");
	}  
}  
class Watsappv2 extends Watsappv1
{  
void msg()
{
	System.out.println("emojis");
	super.msg();
	}  
}  

public class Singlelevel
{
public static void main(String[] args)
	{
	Watsappv2 obj=new Watsappv2();  
		   obj.msg(); 
}
}
