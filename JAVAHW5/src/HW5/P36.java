package HW5;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class P36 
{
	public static void main(String[] args)
	{	
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("以輸入字串 : ");
			System.out.println(str1);
			System.out.println(str2);
			
			br.close();
			
		}
		catch(IOException e)
		{
			System.out.println("輸入輸出有霧");
		}
	}
}
