package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InOutStreamTest {
	public static void main(String[] args) throws IOException {
		/*String content="Hello World!111";
		OutputStreamDemo(content);*/
		/*System.out.println(InputStreamDemo());*/
		copyfile();
	}
	
	public static void OutputStreamDemo(String content) throws IOException{
		File file=new File("E:"+File.separatorChar+"hello.txt");
		OutputStream outputStream=new FileOutputStream(file);
		outputStream.write(content.getBytes());
		outputStream.close();
	}
	
	public static String InputStreamDemo() throws IOException{
		File file=new File("E:"+File.separatorChar+"hello.txt");
		String content="";
		InputStream inputStream=new FileInputStream(file);
		byte[] a=new byte[1024];
		int len = 0;   
        int temp=0;           
        while((temp=inputStream.read())!=-1){
            a[len]=(byte)temp;   
            len++;   
        }
		content=new String(a, 0,len);
		return content;
	}
	
	public static void copyfile() throws IOException{
		File file1=new File("E:"+File.separatorChar+"hello.txt");
		File file2=new File("E:"+File.separatorChar+"hello1.txt");
		OutputStream outputStream=new FileOutputStream(file2);
		InputStream inputStream=new FileInputStream(file1);
		byte[] a=new byte[1024];
		int len=0;
		while ((len=inputStream.read(a))!=-1) {
			outputStream.write(a, 0, len);
		}
	}
	
}
