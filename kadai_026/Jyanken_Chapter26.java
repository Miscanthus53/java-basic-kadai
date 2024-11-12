package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("自分のじゃんけんの手を入力しましょう\n"
								+ "グーはrockのrを入力しましょう\n"
								+ "チョキはscissorsのsを入力しましょう\n"
								+ "パーはpaperのpを入力しましょう");
			
				
			input = scanner.nextLine();
				
			if (!input.equals("r") && !input.equals("s") && !input.equals("p")) {
					System.out.println("正しい手ではありません\n"
									+ "もう一度入力をお願いします\n");
			}
			
		} while(!input.equals("r") && !input.equals("s") && !input.equals("p"));
		
		scanner.close();	
		return input;		
	}
	
	public String getRandom() {
		
		String[] cpu = {"グー", "チョキ", "パー"};
		
		String cpuHand = cpu[(int) Math.floor(Math.random() * 3)];
		
		return cpuHand;
		
	}
	
	public void playGame(String myChoice, String cpuHand) {
		
		HashMap<String, String> myHand =  new HashMap<String, String>();
		
		myHand.put("r", "グー");
		myHand.put("s", "チョキ");
		myHand.put("p", "パー");
		
		System.out.println("自分の手は" + myHand.get(myChoice) + "、対戦相手の手は" + cpuHand);
		
		switch (myHand.get(myChoice)) {
			case "グー" -> {
				switch (cpuHand) {
					case "グー" -> System.out.println("あいこです");
					case "チョキ" -> System.out.println("自分の勝ちです");
					case "パー" -> System.out.println("自分の負けです");
				}	
			}
			
			case "チョキ" -> {
				switch (cpuHand) {
					case "グー" -> System.out.println("自分の負けです");
					case "チョキ" -> System.out.println("あいこです");
					case "パー" -> System.out.println("自分の勝ちです");
				}	
				
			}
			case "パー" -> {
				switch (cpuHand) {
					case "グー" -> System.out.println("自分の勝ちです");
					case "チョキ" -> System.out.println("自分の負けです");
					case "パー" -> System.out.println("あいこです");
				}				
			}		
		}
	}
}
