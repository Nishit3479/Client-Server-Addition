import java.util.*;
import java.io.*;
import java.net.*;

public class MyComputingClient 
{
	public static void main(String[] args) 
	{
		try
		{	
			Scanner in = new Scanner(System.in);
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			System.out.println("Enter Number 1 : ");
			String a = in.next(); 
			System.out.println("Enter Number 2 : ");
			String b = in.next();
			dout.writeUTF(a+" "+b);
			BufferedReader dis = new BufferedReader(new InputStreamReader(s.getInputStream())); 
			String c = dis.readLine();
			System.out.println("The Sum of "+a+" and "+b+" : "+c); 
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
