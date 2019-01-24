package com.pp.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	
	private String[] fortunes = {"It's good day", "It's funny day", "It's day full of adventure"};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		return  fortunes[index];
	
	}


	}
	
	
