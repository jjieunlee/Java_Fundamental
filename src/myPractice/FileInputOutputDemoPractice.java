package myPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//"C:\\dev\\jdk-11.0.7_windows-x64_bin.exe"

public class FileInputOutputDemoPractice {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("C:\\dev\\java.exe");

			int fileByteCounts = 0;
			byte[] fileByte = new byte[1025 * 8];

			while ((fileByteCounts = fis.read(fileByte)) != -1) {
				fos.write(fileByte, 0, fileByteCounts);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
