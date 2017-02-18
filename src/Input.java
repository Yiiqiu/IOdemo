import java.io.*;
import java.nio.charset.Charset;
public class Input {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try	
		{
			//Reader in=new FileReader("C:\\Users\\Hacker\\Desktop\\c.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Hacker\\Desktop\\c.txt"),"UTF-8"));
            int a;
            String line;  
            StringBuffer stringBuffer = new StringBuffer();  
            while((line=br.readLine())!=null)
            {
            	stringBuffer.append(line);
            }
            System.out.println(stringBuffer);
		} catch ( IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}