import java.io.*;
import java.net.*;

public class MyComputingServer 
{
	public static void main(String[] args)
	{
		try{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();

			DataInputStream dis=new DataInputStream(s.getInputStream());
			
			String str="";	
			str=(String)dis.readUTF();
			String []split = str.split("\\s+");
			int a,b;
			a=Integer.parseInt(split[0]);
			b=Integer.parseInt(split[1]);
			int c = a+b;
			String st = String.valueOf(c); 
			PrintStream p = new PrintStream(s.getOutputStream());
			p.println(st);
			System.out.println("Task Successfully Completed..!!");
			ss.close();

		    }
		catch(Exception e)
		{
			System.out.println(e);
		}
    	}
}
