package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		MarioGame game1 = new MarioGame();
		GameRunner g1 = new GameRunner(game1);
		g1.run();

		ContraGame game2 = new ContraGame();
		GameRunner g2 = new GameRunner(game2);
		g2.run();
	}
}