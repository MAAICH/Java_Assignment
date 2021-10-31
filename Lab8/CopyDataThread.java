package Lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyDataThread {
public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream(new File("C:\\Users\\Dell\\eclipse-workspace\\manoj\\Assingment\\src\\Lab8\\Source"));
		OutputStream out = new FileOutputStream(new File("C:\\Users\\Dell\\eclipse-workspace\\manoj\\Assingment\\src\\Lab8\\Target"));
		byte[] buf = new byte[1024];
		int len;

		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader("C:\\Users\\Dell\\eclipse-workspace\\manoj\\Assingment\\src\\Lab8\\Target"));
		String str;

		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in.close();
	}
}