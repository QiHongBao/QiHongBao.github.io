package file;

import java.io.*;
import java.util.*;

public class Dome {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] agrs){
		File file = new File("E://wenjian/file.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
