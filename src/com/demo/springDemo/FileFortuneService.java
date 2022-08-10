package com.demo.springDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

//@Component
public class FileFortuneService implements FortuneService {

	private List<String> theFortunes;
	private Random random = new Random();
	
	public FileFortuneService() throws IOException {
		File file = new File("D:\\Productivity\\Code\\eclipse-workspace\\spring-demo-annotations\\src\\data.txt");
		System.out.println("reading fortunes from file: " + file);
		System.out.println("File exists: " + file.exists());
		
		theFortunes = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String tempLine;
			while((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int index = random.nextInt(theFortunes.size());
		String myFortune = theFortunes.get(index);
		return myFortune;
	}

}
