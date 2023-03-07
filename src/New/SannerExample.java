package New;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SannerExample {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter ur data");
		String n=br.readLine();
		System.out.println("data is:"+n);
	}

}
