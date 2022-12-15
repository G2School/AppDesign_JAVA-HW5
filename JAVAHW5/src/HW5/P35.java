package HW5;

import java.io.*;

public class P35 
{
	public static void main(String[] args)
	{
		
		
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("Bye");
			
			pw.close();
			
			System.out.println("以輸入字串");
		}
		catch(IOException e)
		{
			System.out.println("輸入輸出有霧");
		}
	}
}
