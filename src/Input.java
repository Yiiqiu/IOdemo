
import java.io.*;
public class Input {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String path="C:\\Users\\Hacker\\Desktop\\a.txt";
		
	
		   try {
			PrintWriter out=new PrintWriter(new OutputStreamWriter(new FileOutputStream("c:/utf-8.txt"),"UTF-8"));
		
			out.write("汗");
			out.println("dfsdf");
			out.close();
		   
		   } catch (UnsupportedEncodingException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
		
		   
		
	
	}
}
