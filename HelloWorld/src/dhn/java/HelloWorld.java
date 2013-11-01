package dhn.java;

import java.text.*;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World !!!");
		Date now = new Date();		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
		System.out.println(now);
		System.out.println(dateFormat.format(now));
	}

}
