package programming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindDuplicateWordsInFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		String file = "C:/Users/kulkarnia/Desktop/sample.txt";

		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(line, "");
				System.out.println(tokens);
			}

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
