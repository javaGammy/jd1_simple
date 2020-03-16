package by.htp.simple.main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class Main {	
		public static void main(String args[])throws IOException {
			File file = new File("C:\\Users\\chernyak\\eclipse-workspace\\jd1-simple-class\\src\\resources\\users.txt");

			List<String> list = Files.readAllLines(file.toPath(), Charset.defaultCharset());
			
			String frstUser = list.get(0);
			
			
			
			String[] user;
			
			user = frstUser.split(" ", 4);
			System.out.println(user[2]);
		   }
		
		

	}

