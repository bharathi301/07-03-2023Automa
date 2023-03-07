package New;
class Student5
{  
	double areaOfCircle(double d, int r) 
	{ 
		 double c = d*r*r;
		 System.out.println(c);
		 return c;
		
	}  
    public static void main(String args[])
    {  
    	Student5 s = new Student5();
    	double h = s.areaOfCircle(3.142, 5);
    	System.out.println(h);
    	int g = 20;
    	double j = h+g;
    	System.out.println(j);
   }  
}  