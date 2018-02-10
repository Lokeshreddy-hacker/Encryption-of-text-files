import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.util.*;

public class enc{

	public static void main(String abc[])
	{
	
		int[] s={1,1,3,4,5};
	    	String[] b={"*","-","+","+","-"};
		int result[]=new int[5];
		int k=3,i;	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter File Path and Name:");
		
		File fileName = new File(scanner.nextLine());
		
		

		for(i=0; i<s.length; i++)
	 	{
	 
	 		ScriptEngineManager scm = new ScriptEngineManager();
	 		ScriptEngine jsEngine = scm.getEngineByName("JavaScript");
			try {
				result[i]= (Integer) jsEngine.eval(s[i]+b[i]+k);
			} 
			catch (ScriptException e) {
				e.printStackTrace();
			}
		
		}





		Scanner scan = null;
		int j=0;
	
		try {
			scan = new Scanner(fileName);

			while(scan.hasNextLine()){
		
				String nodes = scan.nextLine();

				for(i=0;i < nodes.length();i++)
				{
    					int enc = (int)nodes.charAt(i)+result[j];

            					FileWriter writer = new FileWriter("encrypt.txt", true);
            					writer.write((char)enc);
           
           				 	writer.close();
						
						j++;
						if(j == 5)
							j = 0;

				}     
				// for complete details contact me @ Lokeshreddy-hacker

			}
		}
		catch(Exception e)
		{
			System.out.println("Not found file");
		}
	}

}
