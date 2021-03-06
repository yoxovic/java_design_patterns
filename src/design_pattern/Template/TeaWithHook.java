package design_pattern.Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageHook {

	@Override
	public void boilWater() {
		System.out.println("Water is boiling!");

	}

	@Override
	public void brew() {
		System.out.println("Steeping the tea!");

	}

	@Override
	public void pourInCup() {
		System.out.println("Pouring into cup");

	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");

	}

	public boolean CustomerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}

	private String getUserInput() {
		String answer = null;

		System.out.println("Would you like Lemon with your tea?(y/n)");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			answer = input.readLine();
		} catch (IOException e) {
			System.err.println("IO error is trying to read your answer");
		}

		if (answer == null) {
			return "no";
		}
			
		return answer;


	}

}
