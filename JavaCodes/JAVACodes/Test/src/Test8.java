import java.io.*;

class Test8{

	public static void main(String args[])throws Exception{
		FileOutputStream fos = new FileOutputStream("Outfile.txt");
		PrintStream psout=new PrintStream(fos);
		psout.println(123);
		psout.println("This is a sample text");
		psout.println("That is all");
		psout.close();
		fos.close();
	}
}