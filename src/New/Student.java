package New;

public class Student 
{
     int id;
	 String name;
	 public Student(int a, String b)
	 {
		  id= a;
	      name = b;
	       System.out.println(id);
		 System.out.println(name);
	 }
	public void main(String[] args)
	{   
		  new Student(10,"Dev");
		 }  
	}



