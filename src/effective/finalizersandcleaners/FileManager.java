package effective.finalizersandcleaners;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileManager {
	
	private static final int BUFFER_SIZE = 1024;


	//try-finally - No longer the best way to close resources.
	static String firstLineOfFile(String path) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			br.close();
		}
	}
	
	
	//try-finally is ugly when used with more than one resources.
	static void copy(String src, String dst) throws IOException{
		
		InputStream in = new FileInputStream(src);
		
		try {
			OutputStream out = new FileOutputStream(dst);
			 try{
				 byte[] buf =  new byte[BUFFER_SIZE];
				 int n;
				 while((n = in.read(buf)) >=0) {
					 out.write(buf, 0, n);
				 }
					 
			 }finally {
				 out.close();
			 }
			
			
		} finally {
			in.close();
		}
	}
	
	//try-with-resources - the best way to close resources.
	static String firstLineOfFile2(String path) throws IOException{
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}
	
	static void copyResource(String src, String dst) throws IOException{
		try(InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)){
			byte[] buf = new byte[BUFFER_SIZE];
			int n;
			while((n = in.read(buf)) >=0) {
				 out.write(buf, 0, n);
			 }
		}
	}

}
