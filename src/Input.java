import java.io.*;
public class Input {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try(Reader in=new FileReader("C:\\Users\\Hacker\\Desktop\\qq.txt"))
		{
			char[] bbuf=new char[1024];
			while(in.read(bbuf)>0)
			{
				System.out.println("");
				System.out.println(new String(bbuf));
			}
		} catch ( IOException e){
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}