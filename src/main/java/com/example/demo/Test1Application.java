package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*; 

@SpringBootApplication
public class Test1Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number n, with 0 < n <= 100\nNumber: ");  
		int a= sc.nextInt();
		sc.close();
		if(a > 0 && a <= 100) {
			for (int i = 0; i < a; i++) {
				String ladder = new String();
				for (int j = 0; j <= i; j++)
					ladder += "#";
				String format = "%" + Integer.toString(a - i) + "s" + ladder;
				System.out.println(String.format(format, ""));
			}
		}
		else {
			System.out.println("Number you specified is out of bounds");			
			
		}
}
}
