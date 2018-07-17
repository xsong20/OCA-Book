package chpt_3_Core_API;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Review_16 {
	public static void main(String[] args) {
		char[] c = new char[2];
		// array has no size(), capacity() methods.
		int length = c.length;
		
		
		// list has size().
		List<Integer> ls = new ArrayList<>();

		//
		try {
			BufferedReader br = new BufferedReader(new FileReader("src"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
