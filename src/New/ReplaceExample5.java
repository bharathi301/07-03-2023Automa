package New;

public class ReplaceExample5 
{
	public static void main(String argvs[])  
	{ 
	// input string  
	String str = "JavaTpoint";  
	System.out.println(str);  
	  
	String regex = "";  
	// adding a white space before and after every character of the input string.  
	str = str.replaceAll(regex, " ");  
	  
	System.out.println(str);  
	  
	}  
	}  
