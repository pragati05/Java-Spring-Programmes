package com.luv2code.springDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFoutuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day !";
	}

}
