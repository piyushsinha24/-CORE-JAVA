import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
class filehandling extends Thread
{
	static void readfile()
	{
		int x;
		FileInputStream f=null;
		try{
		
			f=new FileInputStream("file.txt");
			while((x=f.read())!=-1)
			{
				char ch=(char)x;
				System.out.print(ch);
				try{
					Thread.sleep(500);
				   }
				catch(Exception e){}
				char ch1=Character.toUpperCase(ch);
				System.out.print("\b"+ch1);
				try{
					Thread.sleep(500);
				   }
				catch(Exception e){}
			
			
			}
		}
		   catch(Exception e)
		   {
		   	System.out.println(e);
		   }
		   finally{
		   try{
		    f.close();
		    }catch(Exception e){}
		    }
	
	}
	static void writefile(int w)
	{
		
		FileOutputStream fout;
		try{
			fout=new FileOutputStream("file.txt",true);
			fout.write(w);
		   }
		catch(Exception e){
			System.out.println(e);
		}
			
			
		
	}
		
	public static void main(String...arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many no. u wanna insert");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter a number to write in the file");
		int w=scan.nextInt();
		writefile(w);
		}
		readfile();
	}
}
