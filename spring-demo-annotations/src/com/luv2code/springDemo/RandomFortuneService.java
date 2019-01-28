package com.luv2code.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {

	private String data[] = {
			"Read Read and Read !!!",
			"Health is Wealth !!",
			"Money is your saviour !!"
	};
	
	@Override
	public String getFortune() {

		Random myRandom = new Random();
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
