import java.io.*;
public class FileException1
{
	public static void main(String[] args)
	{
		openFile("C:\test.txt");
	}
	public static void openFile(String name)
	{
		FileInputStream f = new FileInputStream(name);
	}
}
