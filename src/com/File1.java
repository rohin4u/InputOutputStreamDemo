package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		
		String file = "F://abc/abc.txt";
		
		File f = new File(file);
		
//		System.out.println(f.exists());
//		
////		f.createNewFile();
//		
//		f.mkdir();
//		
//		System.out.println(f.exists());
		
		FileWriter fw = new FileWriter(file);
		fw.write("India is the best country to live");
		fw.write(90);
		char[] ch = new char[] {'a', 'b', 'c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("file is written");
		
		
		
		

	}

}
