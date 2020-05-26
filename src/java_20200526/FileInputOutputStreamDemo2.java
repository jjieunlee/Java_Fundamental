package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//바이트배열에 저장하는 read
public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe"); // 입력
			fos = new FileOutputStream("C:\\dev\\jdk2.exe"); // 출력

			// 읽은 바이트 수
			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8]; // 8KB
			// fis.read(readBytes) : FileInputStream에 1024*8바이트를 읽어서 readBytes에 저장하고 읽은
			// 바이트수를 반환

			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
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